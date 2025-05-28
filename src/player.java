public class player {
    public int cardtotal;
    boolean ishit;
    public card [] cards;

    public player() {
        cardtotal = 1;
        ishit = true;
        cards = new card[2];

    }
    public void printall(){
        System.out.println(cardtotal);
        System.out.println(ishit);
        for(int x = 0;x<cards.length; x++){
            cards[x].printall();
        }

    }
}