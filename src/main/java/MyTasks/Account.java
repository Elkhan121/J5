package MyTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


    class Account {

            Scanner input = new Scanner(System.in);



            double sum = 0;
           private  double number = input.nextInt();

            double sum1 = sum + number;

            Account( double number){
                if (number < 0) {
                    number = 0;
                }
            }
        }

    class Credit {
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();
        double sum = 0;

        void setSum(double sum) {
            double sum1 = sum + number;
        }

        double getSum(double sum) {
            double sum1 = sum + number;
            return sum1;
        }
    }

    class Debit{
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();

        void setSum(double sum){
            double sum1 = sum - number;
        }

        double getSum ( double sum){
            double sum1 = sum - number;
            return sum1;
        }

    }




