package MyTasks;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice in = new Invoice(23,43);
        in.getInvoiceAmount(0);
        System.out.println(in.sum1);
    }
}
