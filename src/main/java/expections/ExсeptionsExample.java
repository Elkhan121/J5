package expections;

import java.util.Scanner;

public class ExсeptionsExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = 5;
            int b = 2;
            System.out.println(a / b);

            int ar[] = {1, 2, 3};
            System.out.println(ar[4]);
        } catch (ArithmeticException ex) {
            System.out.println("на ноль делить нельзя! ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("неверный индекс! ");
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("Последний код");

        int x = in.nextInt();
        int y = in.nextInt();

    }

}

