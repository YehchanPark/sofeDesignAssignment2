package Exercise2;

public class Display implements View {


    public void displayText(String text){
        System.out.println("Display view: \n"+text);
    }

    @Override
    public void displayProduct(Product product) {
        System.out.println("Display view: \n"+product.getName()+" "+product.getPrice());
    }
}
