package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class CashRegister extends Subject {
    productDB db = new productDB();
    Display display = new Display();
    TicketPrinter ticketPrinter = new TicketPrinter();
    Product currentProduct;

    public CashRegister(){//Sets up the display and ticket printer
        this.register(display);
        this.register(ticketPrinter);
    }
    List<Observer> observers = new ArrayList<Observer>();//Sets up the observer pattern with an observer
    String[] currentText= new String[2];


    public void setCurrentProductUPC(long UPCCode){//Gets the current product info
        if(db.GetProductInfo(UPCCode)!=null){
            currentProduct=db.GetProductInfo(UPCCode);
            currentText[0]= currentProduct.getName();
            currentText[1]= String.valueOf(currentProduct.getPrice());
            notifyObservers();//Notifies the observer
        }
        else {
            display.displayText("Invalid UPCCODE");//Displays error if the code was not found
        }
    }

    public void getCurrentProductInfo(){//outputs the current product info and uses the ticket printer
        String[] list= new String[2];
        list[0]= currentProduct.getName();
        list[1]= String.valueOf(currentProduct.getPrice());
        display.displayText(currentProduct.getName()+" "+currentProduct.getPrice());
        ticketPrinter.displayText(list);
    }

    @Override
    void register(Observer o) {//Adds observer
        observers.add(o);
        System.out.println("Added view "+o+" to Cash Register");
    }

    @Override
    void unregister(Observer o) {//Removes observer
        try {
            observers.remove(observers.indexOf(o));
            System.out.println("Removed view "+o+" from Cash Register ");
        }
        catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("No such View called "+o+" in Cash Register ");
        }
    }

    @Override
    void notifyObservers() {
        for(Observer o:observers)//for each of the observers
            o.update(currentText);//Update the products

    }
}
