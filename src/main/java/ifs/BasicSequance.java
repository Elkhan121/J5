package ifs;

public class BasicSequance implements Sequense {

    private int current = 1;

    public int getNext() {
        int val = current;
        current++;
        return val;
    }

    public void setStart(int number) {
        current = number;
    }

    public  int getPrevious(int a) {
        current = current + a;
        return current;
    }

}
