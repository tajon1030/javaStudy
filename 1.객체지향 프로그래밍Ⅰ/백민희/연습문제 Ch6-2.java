class Exercise6_2 {
public static void main(String args[]) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();
    System.out.println(card1.info());
    System.out.println(card2.info());
}
}
class SutdaCard {
    int num;
    boolean isKwang;

    public void info(){
        if(isKwang)
            System.out.println(num+"K");
        else
            System.out.println(num);
    }

    SutdaCard(int num, boolean isKawng ){
            this.num=num;
            this.isKwang=isKawng;
    }
    SutdaCard(){
        this(1,true);
    }
}
