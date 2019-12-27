package MyTasks;

import java.util.Random;
import java.util.Scanner;

public class StudentTasks {
    public static void main(String[] args) {
        boolean qwerty = true;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int right = 0;
        int wrong = 0;
        int procent = 0;
        String name1 = "Плохо!";
        String name2 = "Нет,попробуй еще раз!";
        String name3 = "Неверно, подумай!";
        String name4 = "Неправильно,у тебя получится!";

//        TaskHards ts = new TaskHards();
        System.out.println("Выбирете уровень сложности : ");
        System.out.println("1 - однозначные ");
        System.out.println("2 - двухзначные ");
        System.out.println("3 - трехзначные");
        System.out.println("4 - черырехзначные");

        int input = in.nextInt();
//        switch (input) {
//            case 1:
//                for (int i = 0; i <= 10; i++) {
//
//
//                    System.out.println("Решите пример: ");
//                    System.out.println(r1 + " * " + r2);
//                    System.out.println("Ответ: ");
//                }
//                  int r5 = random.nextInt(999) + 100;
//
//                    System.out.println(r4 + " * " + r5);
//                }
//                break;
//            case 4:
//                for (int b = 0; b < 11; b++) {
//                    int r3 = random.nextInt(9999) + 1000;
//                    break;
//                    case 2:
//                        for (int n = 0; n < 11; n++) {
//                            int r3 = random.nextInt(99) + 10;
//                            int r4 = random.nextInt(99) + 10;
//
//                            System.out.println(r3 + "*" + r4);
//                        }
//                        break;
//                    case 3:
//                        for (int a = 0; a < 11; a++) {
//                            int r4 = random.nextInt(999) + 100;
//                            int r4 = random.nextInt(9999) + 1000;
//
//                    System.out.println(r3 + "*" + r4);
//                }
//                break;
//        }


            System.out.println("Решите пример: ");
                    int r1 = random.nextInt(11);
                    int r2 = random.nextInt(11);
//
            System.out.println("Ответ: ");

            int answer = in.nextInt();
            int result = 4;
            if (result == answer) {
                right++;
                int r3 = random.nextInt(4) + 1;
                switch (r3) {
                    case 1:
                        System.out.println("Здорово!");
                        break;
                    case 2:
                        System.out.println("Продолжай в том же духе!");
                        break;
                    case 3:
                        System.out.println("Хорошая работа!");
                        break;
                    case 4:
                        System.out.println("Отлично");
                        break;
                }
            }
            if (result != answer) {
                wrong++;
                int r4 = random.nextInt(4) + 1;
                switch (r4) {
                    case 1:
                        System.out.println(name1);
                        break;
                    case 2:
                        System.out.println(name2);
                        break;
                    case 3:
                        System.out.println(name3);
                        break;
                    case 4:
                        System.out.println(name4);
                        break;
                }
            }

        System.out.println("==================================");
        System.out.println("Неправильных ответов: " + wrong);
        System.out.println("Правильных ответов: " + right);
        procent = 100 / 10 * right;
        System.out.println("Процент правильных ответов: " + procent + "%");
        System.out.println("==================================");
        if (procent >= 75) {
            System.out.println("Отлично , ты делаешь успехи!");
        } else {
            System.out.println("Обратись за помощью к учителю.");
        }
        wrong = 0;
        right = 0;

    }
}

