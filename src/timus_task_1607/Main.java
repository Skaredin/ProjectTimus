package timus_task_1607;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] ar) {
        System.out.println("В задаче в водилось числа 150 50 1000 100");
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("В ведите число A, B, C, D");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println("\n");

        for (int i = b, s = d; c >= a; ) {
            System.out.println(a + " ! " + c + " ! " + "+"+i + " ! "+"-"+ s);
            if(a ==150)
            {
                System.out.println("Мне в аэропорт, заплачу " + a + " рублей.");
                System.out.println("Нет, за " + a + " не повезу, поехали за "+ c);


            }
            if(a == 200)
            {
                System.out.println("Да ты что?! У меня и нет столько! Согласен за " + a + " рублей.");
                System.out.println("Ты смеешься? Давай хотя бы за "+ c);
            }
            if(a == 250)
            {
                System.out.println("Ну хорошо, дам " + a + " рублей.");
                System.out.println("Да ты хоть знаешь, сколько бензин стоит? "+ c+ " и поехали!");
            }

            a = a + i;
            c = c - s;
            if(a == 450)
            {
                System.out.println("Ну хватит последняя цена это "+ c+ " и поехали!");
                System.out.println("Нет давай всётаки " + a + " рублей и поехали!");
                System.out.println("Ну ладно сегодня хороший день тогда с тебя "+ a + "рублей и поехали");
                System.out.println("Хорошо");
                System.out.println("Хорошо");
            }
            System.out.println("…\n");
        }
        System.out.println("Сумма пети: " +a);
    }
}