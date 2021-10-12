package Exercise2;

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
        display.displayProduct(currentProduct);
        ticketPrinter.displayProduct(currentProduct);

    }

}
