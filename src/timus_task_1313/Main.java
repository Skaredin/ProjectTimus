package timus_task_1313;
import java.io.*;
public class Main {
    public static void main(String[] ar)  {


        String inp = "src/timus_task_1313/file.txt";
        boolean oj = System.getProperty("OULINE_JUDGE") != null;

        try {
            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inp));

            int size = Integer.parseInt(bufferedReader.readLine());

            int[][] ints = new int[size][size];
            String read = "";

            for (int i = 0; ((read = bufferedReader.readLine()) != null); i++) {
                String[] str = read.split(" ");
                for (int j = 0; j < size; j++) {
                    ints[i][j] = Integer.parseInt(str[j]);
                }
            }


            for (int i = 0; i < size; i++) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(ints[j][i - j] + " ");
                }
            }

            for (int i = 1; i < size; i++) {
                for (int j = size - 1; j >= i; j--) {
                    System.out.print(ints[j][size - j + i - 1] + " ");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
