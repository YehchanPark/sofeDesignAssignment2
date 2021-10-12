package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class CashRegister extends Subject {
    productDB db = new productDB();
    Display display = new Display();
    TicketPrinter ticketPrinter = new TicketPrinter();
    Product currentProduct;

    public CashRegister(){
        this.register(display);
        this.register(ticketPrinter);
    }
    List<Observer> observers = new ArrayList<Observer>();
    String[] currentText= new String[2];


    public void setCurrentProductUPC(long UPCCode){
        if(db.GetProductInfo(UPCCode)!=null){
            currentProduct=db.GetProductInfo(UPCCode);
            currentText[0]= currentProduct.getName();
            currentText[1]= String.valueOf(currentProduct.getPrice());
            notifyObservers();
        }
        else {
            display.displayText("Invalid UPCCODE");
        }
    }

    public void getCurrentProductInfo(){
        String[] list= new String[2];
        list[0]= currentProduct.getName();
        list[1]= String.valueOf(currentProduct.getPrice());
        display.displayText(currentProduct.getName()+" "+currentProduct.getPrice());
        ticketPrinter.displayText(list);
    }

    @Override
    void register(Observer o) {
        observers.add(o);
        System.out.println("Added view "+o+" to Cash Register");
    }

    @Override
    void unregister(Observer o) {
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
        for(Observer o:observers)
            o.update(currentText);

    }
}
