package Exercise3;

public class Display extends Observer{


    public void displayText(String text){//Displays given text
        System.out.println("Display view: \n"+text);
    }

    @Override
    void update(String[] text) {//Outsputs that a display has been notified
        System.out.println("Display notified\n");
        displayText(text[0]+" "+text[1]);
    }
}
