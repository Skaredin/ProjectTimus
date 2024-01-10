package timus_task_1209;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {
        Scanner s = new Scanner(System.in);
        System.out.println("В ведите исходные данные из задаче\n" +
                "4\n" +
                "3\n" +
                "14\n" +
                "7\n" +
                "6\n\n" );

        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            int s2 = s.nextInt() - 1, sors = 8*s2+1;


            int r = (int) Math.sqrt(sors);
            if(r *r == sors)
            {
                System.out.println("1");
            }else {System.out.println("0");}


        }
    }
}