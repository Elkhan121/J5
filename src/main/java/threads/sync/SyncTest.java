package threads.sync;

import java.util.ArrayList;
import java.util.List;

public class SyncTest {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        new MyThread("#1", array);
        new MyThread("#2", array);
    }
}

class SumArray {

    private int sum;

    public synchronized int sumArray(int array[]) {
        synchronized (this) {
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];

                System.out.println(Thread.currentThread().getName() + " = " + sum);
            }
            return sum;
        }
    }
}

class MyThread implements Runnable {
    private int array[];

    static SumArray sumArray = new SumArray();

    MyThread(String name, int array[]) {
        this.array = array;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        sumArray.sumArray(array);
        int sum = sumArray.sumArray(array);
        System.out.println(Thread.currentThread().getName() + ".total = " + sum);
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

class Printer {
   public void print(String printer,List<Integer> numbers){
       for (Integer i: numbers
            ) {

       System.out.println(printer + " - " + i);
       }
    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
}