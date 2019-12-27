package threads;

import java.util.Scanner;

public class CountDown extends Thread {

    Scanner in = new Scanner(System.in);
    int second = in.nextInt();

    public void run() {
        for (int i = 0; i <= second; second--) {
            System.out.println("Start -  " + second);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("Ураааа!!!!");
    }
}