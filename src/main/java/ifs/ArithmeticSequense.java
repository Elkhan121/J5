package ifs;

public class ArithmeticSequense implements BidirectionalSequanse {

    private int current;
    private int step;

    public ArithmeticSequense(int start){
        current = start;

    }

    public ArithmeticSequense(int start, int step){
        current = start;
        this.step = step;
    }

    public void setStart(int number) {

    }

    public void setStep(int step){

    }

    public int getNext() {
        int val = current;
        current += step;
        return val;

    }


    public int getPrevious() {
        int val = current;
        current -= step;
        return val;
    }

}

