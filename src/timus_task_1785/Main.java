package timus_task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar)
    {
        System.out.println("В задаче в водилось числа 240");
        Scanner in = new Scanner(System.in);
        System.out.println("В ведите число от 1 до ~~");
        int a = in.nextInt();
        String[] ingl = {"few", "several", "pack", "lots", "horde", "throng", "swarm", "zounds", "legion"};
        String[] rus = {"несколько", "немного", "отряд", "толпа", "орда", "множество", "сонмище", "полчище", "легион"};
        int i = 0;
        if(a>=1 && a<=4 )
        {
            i = 0;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);

        }else if(a>=5 && a<=9 )
        {
            i = 1;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=10 && a<=19 )
        {
            i = 2;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=20 && a<=49 )
        {
            i = 3;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=50 && a<=99 )
        {
            i = 4;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=100 && a<=249 )
        {
            i = 5;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=250 && a<=499 )
        {
            i = 6;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=500 && a<=999 )
        {
            i = 7;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }else if(a>=1000)
        {
            i = 8;
            System.out.println("Англиский: "+ingl[i]+ " Русский: "+rus[i]);
        }

    }
}