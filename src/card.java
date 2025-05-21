public class card {
    public String number;
    public String suit;
    public boolean iseleven;
    public int value;

    //togi likes druges and roids
    public card(int pnumber) {
        number = "six";
        iseleven = false;
        value = 6;
        suit = "heart";

        if (pnumber == 13) {
            number = "king";
            suit = "heart";
            iseleven = false;
            value = 10;
        }
    }

    public void printall(){
        System.out.println("the card is " + number + " of " + suit + " its worth "+ value+ " points, and iseleven = "+iseleven);
    }
}
