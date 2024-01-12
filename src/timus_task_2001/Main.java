package timus_task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Код с задания\n" +
                "1 2\n" +
                "2 1\n" +
                "0 3\n"
        );

        int a1 = in.nextInt(), v1 = in.nextInt();
        int a2 = in.nextInt(), v2 = in.nextInt();
        int a3 = in.nextInt(), v3 = in.nextInt();

        int d = v1 - v2;
        int b = v3 - d - v2;


        System.out.println(d + " " + b);

    }
}