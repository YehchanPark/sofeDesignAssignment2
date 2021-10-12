package Exercise1;

public class TicketPrinter {
    public void displayText(String[] text){

        String s = String.format("%-15s  %3s", "Product", "Price");
        String s1 = String.format("%-15s  %3s", "------", "-----");
        String line = String.format("%-15s %5s", text[0], text[1]);

        System.out.println("Ticketprinter view: \n"+s);
        System.out.println(s1);
        System.out.println(line);
    }
}
