package timus_task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("В ведите исходные данные в задаче\n" +
                "1 2 3\n"  );
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();


        if(b == 0 || b==1 || c == 1)
        {
            System.out.println(a-b-c);
        }else {
            System.out.println(a-b*c);
        }
    }
}
