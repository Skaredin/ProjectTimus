package timus_task_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] ar) throws IOException {
        String inp = "src/timus_task_1910/file.txt";
        boolean oj = System.getProperty("OULINE_JUDGE") != null;

        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inp));

        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int[] intsA = new int[size - 2];
        for (int i=0; i<intsA.length; i++)
        {
            intsA[i] = Integer.parseInt(strings[i])+
                    Integer.parseInt(strings[i+1])+
                    Integer.parseInt(strings[i+2]);

        }
        int[] ints = Arrays.copyOf(intsA, intsA.length);
        Arrays.sort(intsA);
        int firstV = intsA[intsA.length -1];

        for(int i=0; i<intsA.length; i++)
        {
            if (ints[i] == firstV)
            {
                out.println(firstV + " "+(i+2));
                break;
            }
        }
        out.flush();
    }
}
