package expections;

public class CustomExceptionExample {
    public static void main(String[] args) {

        try {
            testMethod(2);
        } catch (MyException ex) {
            ex.printStackTrace();
        }

    }

    public static void testMethod(int a) throws MyException {
        if (a % 2 == 0) {
            throw new MyException(a);
        } else {
            System.out.println("Нечетное число ");
        }
    }

    public static void testMethod2(int a, int b) throws MyException {
        int result = a / b;
        if (a % 2 == 0) {
            throw new MyException(a);
        } else {
            System.out.println("Нечетное число ");
        }
    }

}
