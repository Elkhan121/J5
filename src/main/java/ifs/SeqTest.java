package ifs;

public class SeqTest {

    public static void main(String[] args) {
        Sequense s = new BasicSequance();
        s.setStart(10);

        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());

        ArithmeticSequense as = new ArithmeticSequense(2, 3);


        BidirectionalSequanse bd = new ArithmeticSequense(2, 4);

        System.out.println("===========================");
        ((ArithmeticSequense) bd).setStep(3);
        System.out.println(as.getNext());
        System.out.println(as.getNext());
        System.out.println(as.getNext());

        System.out.println("===========================");
        System.out.println(as.getPrevious());
        System.out.println(as.getPrevious());
        System.out.println(as.getPrevious());
        System.out.println(as.getPrevious());


        Sequense sa = new ArithmeticSequense(2, 5);

    }
}
