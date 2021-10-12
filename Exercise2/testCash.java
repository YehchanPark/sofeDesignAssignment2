package Exercise2;

public class testCash {
    public static void main(String[] args) {
        CashRegister cash = new CashRegister();
        Keyboard key = new Keyboard();
        Scanner scan = new Scanner();

        cash.setCurrentProductUPC(key.setUPCCode("012345678905"));
        cash.getCurrentProductInfo();

        cash.setCurrentProductUPC(scan.scannedUPCCode("112345678905"));
        cash.getCurrentProductInfo();

    }
}
