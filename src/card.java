public class card {
    public String number;
    public String suit;
    public boolean iseleven;
    public int value;

    //togi likes druges and roids
    public card(int pnumber,int psuit) {
        number = "ace";
        iseleven = true;
        value=11;
        suit = "heart";
        if(psuit == 3){
            suit = "diamond";
        }
        if(psuit == 2){
            suit = "heart";

        }
        if(psuit == 4){
            suit = "clubs";

        }
        if(psuit == 1){
            suit = "spades";

        }
        if(pnumber == 13){
            number = "king";
            value = 10;
        }
        if(pnumber == 12){
            number = "queen";
            value = 10;
        }
        if(pnumber == 11){
            number = "jack";
            value = 10;
        }
        if(pnumber == 10){
            number = "ten";
            value = 10;
        }
        if(pnumber == 9){
            number = "nine";
            value = 9;
        }
        if(pnumber == 8){
            number = "eight";
            value = 10;
        }
        if(pnumber == 7){
            number = "seven";
            value = 7;
        }
        if(pnumber == 6){
            number = "six";
            value = 6;
        }
        if(pnumber == 5){
            number = "five";
            value = 5;
        }
        if(pnumber == 4){
            number = "four";
            value = 4;
        }
        if(pnumber == 3){
            number = "three";
            value = 3;
        }
        if(pnumber == 2){
            number = "two";
            value = 2;
        }
        if(pnumber == 11){
            number = "ace";
            value = 11;
            iseleven = true;
        }



    }

    public void printall(){
        System.out.println("the card is " + number + " of " + suit + " its worth "+ value+ " points, and iseleven = "+iseleven);
    }
}
