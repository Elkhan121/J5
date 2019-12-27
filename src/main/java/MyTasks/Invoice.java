package MyTasks;

import java.util.Scanner;

 class Invoice {

    Scanner input = new Scanner(System.in);
  //  String name;
    //String description;
    int sum = input.nextInt();
    double price = input.nextInt();
    double sum1;

    Invoice( int sum , double price){
        if(sum < 0){
            sum = 0;
        } else if(price < 0){
            price = 0;
        }
    }

    double getInvoiceAmount(double sum1){
        this.sum1 = sum * price;
        return sum1;
    }


}
