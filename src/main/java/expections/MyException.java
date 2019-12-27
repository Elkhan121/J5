package expections;

public class MyException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyException(int number) {
        super("ошибка из за цифры " + number);
    }
}
