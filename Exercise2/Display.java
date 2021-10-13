package Exercise2;

public class Display implements View {


    public void displayText(String text){//Displays the given text
        System.out.println("Display view: \n"+text);
    }

    @Override
    public void displayProduct(Product product) {//Uses the super class for view display
        System.out.println("Display view: \n"+product.getName()+" "+product.getPrice());
    }
}
