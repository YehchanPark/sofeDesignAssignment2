package Exercise1;

public class testCash {
    public static void main(String[] args) {
        CashRegister cash = new CashRegister();//Creates new cash register, keyboard, and scanner
        Keyboard key = new Keyboard();
        Scanner scan = new Scanner();

        cash.setCurrentProductUPC(key.setUPCCode("012345678905"));//Sets the current product to the product at this upc
        cash.getCurrentProductInfo();//Outputs the product info

        cash.setCurrentProductUPC(scan.scannedUPCCode("112345678905"));//Same as before, but with a different upc
        cash.getCurrentProductInfo();

    }
}
