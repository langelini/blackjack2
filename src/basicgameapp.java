import javax.swing.*;

public class basicgameapp {
    public player kat;
    public dealer lizard;
    public card [] deck = new card[51];
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        new basicgameapp();

    }
    public basicgameapp() {
        System.out.println("welcome to mr. angelini's blackjack game");
        for (int l = 0;l<4;l++) {
            int y =0;

            for (int x = 0; x < 13; x++) {
                card c = new card(x + 1,y);
                c.printall();

                c = deck[x];
                y++;
            }

        }
    }
}