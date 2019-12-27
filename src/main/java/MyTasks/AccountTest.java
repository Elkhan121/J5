package MyTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("Введите начальный счет: ");
       Account ac = new Account(0);

        System.out.println("Ваш счет: " + ac.sum1);
        Scanner input = new Scanner(System.in);
        System.out.println("1 - увеличить счет ");
        System.out.println("2 - уменьшить счет ");
        int number = input.nextInt();
        if(number == 1 ) {


            System.out.println("Увеличить счет на : ");
            Credit cr = new Credit();
            double sum = ac.sum1 + cr.number;
            System.out.println("Новый счет равен : " + sum);

        } else if (number == 2){
            System.out.println("уменьшить счет на : ");
            Debit db = new Debit();
            double sum =  - db.number;

            System.out.println("Новый счет равен : " + sum);
        }
    }
}

