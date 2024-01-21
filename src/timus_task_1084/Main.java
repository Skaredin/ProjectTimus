package timus_task_1084;

import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] ar) {
        System.out.println();
        JFrame jFrame = new JFrame();
        String getMessage = JOptionPane.showInputDialog(jFrame, "В задании сказано в вести число (10 6)", "10 6");

        String[] data = getMessage.split(" ");
        double s = Double.parseDouble(data[0]);
        double r = Double.parseDouble(data[1]);
        double a = 0;
        double pi = Math.PI;
        double y = r * r;
        if (r <= s / 2)
            a = pi * y;
        else if (Math.sqrt(2) * 0.5 * s <= r)
            a = s * s;
        else {
            double z = 2 * Math.acos(s / (2 * r));
            a = pi * y - 4 * (0.5 * y * (z - Math.sin(z)));
        }
        a = Math.round(a * 1000.0) / 1000.0;
        JOptionPane.showMessageDialog(jFrame, "Your message:  " + a);
    }
}