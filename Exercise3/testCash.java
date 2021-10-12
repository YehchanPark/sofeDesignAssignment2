package Exercise3;

public class testCash {
    public static void main(String[] args) {
        CashRegister cash = new CashRegister();
        Keyboard key = new Keyboard();
        Scanner scan = new Scanner();

        System.out.println("\n");
        cash.setCurrentProductUPC(key.setUPCCode("012345678905"));
        System.out.println("\n");
        cash.setCurrentProductUPC(scan.scannedUPCCode("112345678905"));

    }
}
