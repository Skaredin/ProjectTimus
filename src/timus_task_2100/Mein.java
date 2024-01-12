package timus_task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mein {
    public static void main(String[] ar) {
        String inp = "src/timus_task_2100/input.txt";
        String inp2 = "src/timus_task_2100/input2.txt";

        boolean oj = System.getProperty("OULINE_JUDGE") != null;


        int mars = 2;
        try {

            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inp));
            BufferedReader bufferedReader2 = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inp2));

            String red = "";
            int numOF = 0;
            int numOP = 0;


            while ((red = bufferedReader.readLine()) != null) //Второй вариант тут bufferedReader2
            {
                if (numOF == 0) {
                    numOF = Integer.parseInt(red);
                    continue;
                }
                if (red.contains("+")) {
                    numOP++;

                }
            }

            int result;
            int guests = (mars + numOF + numOP);
            if (guests == 13) {
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }

            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
