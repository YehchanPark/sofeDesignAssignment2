package Exercise1;

public class CashRegister {
    productDB db = new productDB();
    Display display = new Display();
    TicketPrinter ticketPrinter = new TicketPrinter();
    Product currentProduct;

    public void setCurrentProductUPC(long UPCCode){
        if(db.GetProductInfo(UPCCode)!=null){
            currentProduct=db.GetProductInfo(UPCCode);
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

}
