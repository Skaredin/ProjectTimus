package timus_task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Mein {
    public static void  main(String[] ar)
    {
        System.out.println("В задаче в водилось числа 4 7");
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("В ведите число A и B ");
        int a = in.nextInt(), b = in.nextInt();

        int num = a+b -1;
        int h = num -a;
        int l = num -b;

        out.println(h+" "+ l);
        out.flush();
    }
}
