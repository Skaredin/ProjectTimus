package timus_task_1877;

import java.util.Scanner;

public class Main {

    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("В задаче в водилось\n"+"0001\n" +
                        "0000\n"+"или\n"+"0002\n" +
                "0001");
        System.out.println("Какой код в ведёт Ден ?");
        int c1 = s.nextInt(), c2 = s.nextInt();

        if(c1 % 2 == 0 || c2 % 2 != 0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
