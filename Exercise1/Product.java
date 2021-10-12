package Exercise1;

public class Product {//Product object
    long UPCCODE;//UPC code is a long since int does not store enough digits
    String name;
    double price;
    public Product(String UPCCODE, String name, double price){//Constructor
        this.UPCCODE=Long.parseLong(UPCCODE);
        this.name=name;
        this.price=price;
    }


    //Getters
    public long getUPCCODE() {
        return UPCCODE;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
