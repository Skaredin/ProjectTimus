package timus_task_1639;

import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] ar) {
        for (int i = 0; i <= 1; i++) {
            Scanner s = new Scanner(System.in);
            PrintWriter P = new PrintWriter(System.out);
            System.out.println("В ведите исходные данные из задаче\n" +
                    "2 4\n\nИли\n" +
                    "1 3\n");
            int a = s.nextInt(), x = s.nextInt(), se = (a * x) % 2;

            P.println((se != 0) ? ("[:=[first]") : ("[second]=:]"));
            P.flush();

        }
    }
}