import javax.swing.*;

public class basicgameapp {
    public player kat;
    public dealer lizard;
    public card [] deck = new card[52];
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        new basicgameapp();

    }
    public basicgameapp() {
        System.out.println("welcome to mr. angelini's blackjack game");
        int counter =0;
        for (int l = 0;l<4;l++) {

            for (int x = 0; x < 13; x++) {
                card c = new card(x + 1,l);

                deck[counter] = c;
                deck[counter].printall();
                counter++;



            }

        }

        printdeck();
        kat = new player();
        kat.cards[0] = deck[(int)(Math.random()*52)];
        kat.cards[1] = deck[(int)(Math.random()*52)];
        kat.printall();
        lizard = new dealer();
        lizard.cards[0]=deck[(int)(Math.random()*52)];
        lizard.cards[1] = deck[(int)(Math.random()*52)];
        lizard.printall();
    }
        public void printdeck(){
            for(int x = 0; x<deck.length; x++){
                System.out.println(x);
                deck[x].printall();

            }
        }

}