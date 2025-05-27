public class dealer {
    public int carttotal;
    public card [] cards;
    public boolean isover17;
    public dealer(){
        carttotal = 1;
        isover17 = true;

    }

    public void printall(){
        System.out.println(carttotal);
        System.out.println(cards);
        System.out.println(isover17);
    }
}
