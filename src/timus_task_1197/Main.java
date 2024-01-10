package timus_task_1197;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {
        Scanner s = new Scanner(System.in);
        PrintWriter P = new PrintWriter(System.out);
        System.out.println("В ведите исходные данные из задаче\n" +
                "3\n" +
                "a1\n" +
                "d4\n" +
                "g6\n");
        int a = s.nextInt(), x, y, bin = 0;

        char x1, y1;
        for(int q = 0; q<a;q++)
        {
            String position = s.next();
            x1 = position.charAt(0);
            y1 = position.charAt(1);

            x = (int) x1 - 96;
            y = (int) y1 - 48;

            for (int i=-2;i<=2;i++)
            {
                for (int j=-2;j<=2;j++)
                {
                    if(x-i>0&&y-j>0&&x-i<9&&y-j<9)
                    {
                        if(i*i+j*j==5)
                        {
                            bin++;
                        }
                    }
                }
            }
            P.println(bin);
            bin = 0;
        }
        P.flush();
    }
}
