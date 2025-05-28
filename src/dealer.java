public class dealer {
    public int carttotal;
    public card [] cards;
    public boolean isover17;
    public dealer(){
        carttotal = 1;
        isover17 = true;
        cards = new card[2];

    }

    public void printall(){
        System.out.println(carttotal);
        System.out.println(cards);
        System.out.println(isover17);
        for(int x = 0; x<cards.length;x++){
            cards[x].printall();
        }
    }
}
