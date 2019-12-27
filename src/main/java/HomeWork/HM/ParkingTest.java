package HomeWork.HM;

import java.util.Scanner;

public class ParkingTest {

    public static void main(String[] args) {
        boolean qwerty = true;
        boolean asdfgh = true;
        int result = 0;

        while (qwerty) {
            System.out.println("1 - Ввести данные о парковке ");
            System.out.println("2 - Показать результат ");
            System.out.println("3 - Выход.");
            Scanner input = new Scanner(System.in);
            int inpt = input.nextInt();
            if (inpt == 1) {
            while (asdfgh) {
//                System.out.println("Введите кол-во машин: ");
//                int quantity = input.nextInt();


                    System.out.println("Введите кол-во времени(в минутах):");
                    ParkingGarage pr = new ParkingGarage();
                    if ( pr.minutes >= 1 && pr.minutes < 180) {
                    pr.getSum();
                    System.out.println("hbfv " + pr.getSum());
                    System.out.println("Для выхода в главное меню нажмите 0. ");
                } else if(pr.minutes > 180){
                  pr.getBalance();
                    System.out.println("rff " + pr.getBalance());
                }


                else if (pr.minutes == 0) {
                        asdfgh = false;
                    }
                    result = pr.getSum();
                }

                }  if(inpt == 2) {
                    System.out.println("Ваша задолжность на данный момент: " + result + "$");
                } else if (inpt == 3) {
                    qwerty = false;
                    System.out.println("Пока!");

                }
            }
        }
    }
