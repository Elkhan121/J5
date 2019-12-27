package MyTasks;

import java.util.Random;
import java.util.Scanner;

public class TaskHards {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                for (int i = 0; i < 11; i++) {
                    int r1 = random.nextInt(99) + 10;
                    int r2 = random.nextInt(99) + 10;

                    System.out.println(r1 + "*" + r2);
                }
                break;
            case 2:
                for (int a = 0; a < 11; a++) {
                    int r2 = random.nextInt(999) + 100;
                    int r3 = random.nextInt(999) + 100;

                    System.out.println(r2 + " * " + r3);
                }
                break;
            case 3:
                for (int b = 0; b < 11; b++) {
                    int r3 = random.nextInt(9999) + 1000;
                    int r4 = random.nextInt(9999) + 1000;

                    System.out.println(r3 + "*" + r4);
                }
                break;
        }


    }
}
