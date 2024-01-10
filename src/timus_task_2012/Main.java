package timus_task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("В ведите любую цифру от 1 до ~~");
        int numT = in.nextInt();
        int dif = 12 -numT;
        int time = dif * 45;
        if(time <= 240)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        out.flush();
    }
}
