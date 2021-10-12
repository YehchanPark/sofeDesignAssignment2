package Exercise3;

public class productDB {
    Product apple = new Product("012345678905","Apple",1.00);
    Product grapes = new Product("112345678905","Grapes",1.25);
    Product pear = new Product("212345678905","Pear",1.10);
    Product watermelon = new Product("312345678905","Watermelon",2.00);
    Product lemon = new Product("412345678905","Lemon",1.50);




    public productDB(){

    }
    Product[] productList = {apple,grapes,pear,watermelon,lemon};



    public Product GetProductInfo(long UPCCode){
    
        for (int i = 0; i < productList.length; i++) {
            if(productList[i].getUPCCODE() == UPCCode){
                return productList[i];
            }

        }
       return null;
    }

   }
