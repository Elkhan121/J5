package MyTasks;

import javax.swing.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        boolean qwerty = true;

        while(qwerty) {
            System.out.println("Введите число : ");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Факториал числа = " + result);
        }
    }
}
