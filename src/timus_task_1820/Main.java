package timus_task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("В ведите исходные данные\n" +
                "3 2\n"  );
        int k = s.nextInt(), k2 = s.nextInt();

        if(k2>=k)
        {
         System.out.println(2);
        }else
        {
            int sr = (k * 2);
            if(sr % k2 ==0)
            {
                System.out.println(sr/k2);

            }else {

                System.out.println(sr/k2 + 1);

            }
        }
    }
}
