package threads;

public class MainThread {

    public static void main(String[] args) {


//        MyThread thread = new MyThread("Orange");
//        thread.start();


//        MyThread thread2 = new MyThread("Apple");
//        thread2.start();

        CountDown cd = new CountDown();
        cd.start();


//        for (int i = 500; i < 600; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(150);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
