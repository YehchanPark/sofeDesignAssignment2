package Exercise2;

public class TicketPrinter implements View {//Uses the view class for the command display product
    String s = String.format("%-15s  %3s", "Product", "Price");
    String s1 = String.format("%-15s  %3s", "------", "-----");
    public void displayText(String[] text){//Displays teh text int he wanted way
        String line = String.format("%-15s %5s", text[0], text[1]);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(line);
    }

    @Override
    public void displayProduct(Product product) {//Displays the product in the wanted way
        String line = String.format("%-15s %5s", product.getName(), product.getPrice());
        System.out.println("Ticketprinter view: \n"+s);
        System.out.println(s1);
        System.out.println(line);
    }
}
