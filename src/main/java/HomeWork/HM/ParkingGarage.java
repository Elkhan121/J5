package HomeWork.HM;

import java.util.Scanner;

public class ParkingGarage {
    Scanner input = new Scanner(System.in);

    int minutes = input.nextInt();
    private int sum;
    int price = 2;
    private int sum1;
    private int balance;


    void calculateCharges(int minutes, int balance) {
        if (minutes < 180) {
            minutes = price;
        } else if (minutes > 180) {
           balance = (minutes - 180) * 2;
        }
    }


    public int getBalance() {
        this.balance *= 2;
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSum() {
        this.sum = price;
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;

    }
}