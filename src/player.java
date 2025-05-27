public class player {
    public int cardtotal;
    boolean ishit;
    public card [] cards;
    public player sammy = new player();

    public player() {
        cardtotal = 1;
        ishit = true;

    }
    public void pintall(){
        System.out.println(cardtotal);
        System.out.println(ishit);
        System.out.println(cards);
        System.out.println(sammy);
    }
}