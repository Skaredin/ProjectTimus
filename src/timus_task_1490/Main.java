package timus_task_1490;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {

        JFrame jFrame = new JFrame();
        int getMessage = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "В задании сказано в вести число (2)", "2"));
        JFrame jFrame2 = new JFrame();
        int getMessage2 = Integer.parseInt(JOptionPane.showInputDialog(jFrame2, "В задании сказано в вести число (4)", "4"));


        int[] s = {getMessage, getMessage2};
        int i=0;
        for (; i<=1 ;i++) {
            long count = 0;
            for (double x = 0; x < s[i]; x++) {
                count += (long) Math.ceil(Math.sqrt((double) s[i] * s[i] - x * x));

            }
            JOptionPane.showMessageDialog(jFrame, "исходные данные "+s[i]+" результат: "+4*count);


        }

    }
}