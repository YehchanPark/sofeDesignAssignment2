package Exercise2;

public class CashRegister {
    productDB db = new productDB();
    Display display = new Display();
    TicketPrinter ticketPrinter = new TicketPrinter();
    Product currentProduct;

    public void setCurrentProductUPC(long UPCCode){//Sets the current product to be at the given upc code
        if(db.GetProductInfo(UPCCode)!=null){//As long as it's not null
            currentProduct=db.GetProductInfo(UPCCode);
        }
        else {
            display.displayText("Invalid UPCCODE");//If it is null, it will not work
        }
    }

    public void getCurrentProductInfo(){
        display.displayProduct(currentProduct);
        ticketPrinter.displayProduct(currentProduct);

    }

}
