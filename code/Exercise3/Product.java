package Exercise3;

public class Product {
    long UPCCODE;
    String name;
    double price;
    public Product(String UPCCODE, String name, double price){
        this.UPCCODE=Long.parseLong(UPCCODE);
        this.name=name;
        this.price=price;
    }

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
