package timus_task_1880;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] ar) throws IOException {
        String inp = "src/timus_task_1880/file.txt";

        boolean oj = System.getProperty("OULINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inp));

        int s1 = Integer.parseInt(bufferedReader.readLine());
        String[] st1 = bufferedReader.readLine().split(" ");
        int s2 = Integer.parseInt(bufferedReader.readLine());
        String[] st2 = bufferedReader.readLine().split(" ");
        int s3 = Integer.parseInt(bufferedReader.readLine());
        String[] st3 = bufferedReader.readLine().split(" ");


        int as = s1 + s2 + s3;
        String[] st = new String[as];

        for (int i=0, x = 0, y=0;  i<as; i++ )
        {
            if(i<s1)
            {
                st[i] = st1[i];
                continue;
            }
            if (i<(s1+s2))
            {
                st[i]=st2[x];
                x++;
                continue;
            }
            st[i] = st3[y];
            y++;
        }
        Arrays.sort(st);
        int c = 0;

        for (int i = 1; i< st.length - 1; i++)
        {
            if (st[i-1].equals(st[i]) && st[i].equals(st[i+1]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
