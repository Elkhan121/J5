package MyTasks;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TemperatureTest {

    public static void main(String[] args) {
        boolean qwerty = true;

        while (qwerty) {
            System.out.println("1 - Перевести с Цельсия на Форегейт.");
            System.out.println("2 - Перевести с Форенгейта на Цельсий.");
            System.out.println("0 - Выход. ");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            if (number == 1) {
                System.out.println("Введите температуру :");
                TemperatureUtils t = new TemperatureUtils();
                System.out.println("Результат : " + t.getFahrenhiet() + " F");
            } else if (number == 2) {
                System.out.println("Введите температуру :");
                TemperatureCelsius tc = new TemperatureCelsius();
                System.out.println("Результат : " + tc.getTemperature() + " C");
            } else if (number == 0) {
                qwerty = false;

                System.out.println("");
            }

        }
    }
}
