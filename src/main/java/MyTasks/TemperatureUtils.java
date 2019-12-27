package MyTasks;

import java.util.Scanner;

  final class TemperatureUtils {

    // С цельсия на Форенгейт.
    Scanner in = new Scanner(System.in);
    private double temp = in.nextInt();
    static private double fahrenhiet;

    public double getFahrenhiet() {
        fahrenhiet = 9.0 / 5.0 * temp + 32;
        return fahrenhiet;
    }
}

    // С Форенгейта на цельсий
    final class TemperatureCelsius {
        Scanner in = new Scanner(System.in);
        private double fahrenheit = in.nextInt();
        static private double temp;

        public double getTemperature() {
            temp = 5.0 / 9.0 * (fahrenheit - 32);
            return temp;
        }
    }

