package array;

import java.util.Random;

public class array1 {
    public static void main(String[] args) {
        int ar[] = new int[5];
        int ar2[][] = new int[3][5];
        int counter = 1 ;

        Random r = new Random();
//
//        int x = 0;
//        while (x < 3){
//
//          int y = 0;
//             while(y < 5){
//
//                y++;
//             }
//
//            x++;
//        }

//        int a = 0, b = 0;
//        while(a < 3){
//            while(b < 5){
//                a = 0;
//                System.out.print(ar2[a][b] + " ");
//                b++;
//            }
//            System.out.println();
//            a++;
////        }
//        for (int f = 0; f < 3; f++) {
//            for (int y = 0; y < 5; y++) {
//                System.out.print(ar2[f][y]);
//
//
//            }
//            System.out.println();
//        }
        System.out.println(ar2.length);

        for (int s = 0; s < ar2.length; s++) {
            counter = 1;

            for (int d = 0; d < ar2[s].length; d++) {
                ar2[s][d] = counter;
                counter++;
                System.out.print(ar2[s][d] + " ");

            }
            System.out.println();
        }
    }
}
