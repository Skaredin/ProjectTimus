package timus_task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("В ведите исходные данные\n" +
                "5 3\n6 7 2\n или\n5 3\n20 0 0 \n"  );
        int k = s.nextInt(), k2 = s.nextInt();

        int l=0;
        for (int i=0; i< k2; i++)
        {
            int x = s.nextInt();
            l = l + x-k;
            if(l<0){
                l=0;
            }
        }
        System.out.println("\n"+l);
    }
}
