package 第二十二周;

/**
 * Created by ASUS on 2016/11/3.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String s = sc.next();
        Main a = new Main();
        a.childs(L, s);
    }

    public void childs(int L, String s) {
        String s1[][] = new String[60][60];
        int in[][] = new int[60][60];
        int max = 0;
        int td = 0;
        int tj = 0;
        for (int i = L; i < s.length(); i++){
            for (int j = 0; j <= s.length() - i; j++) {
                s1[i][j] = s.substring(j, j + i);
            }
        }

        for (int i = L; i < s.length(); i++)
            for (int j = 0; j <= s.length() - i; j++)
                for (int k = j; k <= s.length() - i; k++)
                    if (s1[i][k].equals(s1[i][j])) {
                        in[i][j] = in[i][j] + 1;
                    }
        for (int i = L; i <= s.length(); i++)
            for (int j = 0; j <= s.length() - i; j++) {
                if (in[i][j] >= max && td != i) {
                    max = in[i][j];
                    td = i;
                    tj = j;
                } else if (in[i][j] > max) {
                    max = in[i][j];
                    td = i;
                    tj = j;
                }
            }
        System.out.println(s1[td][tj]);
    }
}