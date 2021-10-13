package Exercise3;

public class testCash {
    public static void main(String[] args) {
        CashRegister cash = new CashRegister();//Creates new cash register, keyboard, and scanner
        Keyboard key = new Keyboard();
        Scanner scan = new Scanner();

        System.out.println("\n");
        cash.setCurrentProductUPC(key.setUPCCode("012345678905"));//Sets up the current proudct at a given upc through the keyboard
        System.out.println("\n");
        cash.setCurrentProductUPC(scan.scannedUPCCode("112345678905"));//Same as before but now using the scanner

    }
}
