package 第十八周作业;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/10/5.
 */
public class PopGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[30][30];
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        String str = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j < y - 2)
                    if (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i][j + 2]) {
                        str = str + i + "," + j + ";" + i + "," + (j + 1) + ";" + i + "," + (j + 2) + ";";
                    }
                if (i < x - 2)
                    if (arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i + 2][j]) {
                        str = str + i + "," + j + ";" + (i + 1) + "," + j + ";" + (i + 2) + "," + j + ";";
                    }
            }
        }
        String[] del = str.split(";");
        String[] xy = null;
        int m = 0, n = 0;
        for (String string : del) {
            xy = string.split(",");
            m = Integer.parseInt(xy[0]);
            n = Integer.parseInt(xy[1]);
            arr[m][n] = 0;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]);
                if (j < y - 1)
                    System.out.print(" ");
            }
            if (i < x - 1)
                System.out.println();
        }
    }
}
