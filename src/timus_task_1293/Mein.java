package timus_task_1293;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mein {

    public static void main(String[] ar) {

        System.out.println("В задаче в водилось числа 5 2 3");
        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        int result = (n * (a * b)) *2;
        out.println(result);
        out.flush();
    }

}
