package expections;

public class LoopExceptionExample {
    public static void main(String[] args) {
        int ar1[] = {6, 8, 3, 15, 5, 46, 66};
        int ar2[] = {3, 4, 0, 7, 0, 10};

        try {
            for (int i = 0; i < ar1.length; i++) {
                try {
                    System.out.println(ar1[i] / ar2[i]);

                } catch (ArithmeticException ex) {
                    System.err.println("деление на ноль на " + i + " индексе");
                }
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Неверный индекс: " + ex.getMessage());
        }
    }
}
