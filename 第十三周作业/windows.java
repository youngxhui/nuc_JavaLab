import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/20.
 *
 */
public class windows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] values = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                values[i][j] = input.nextInt();
            }
        }

        int[] num = new int[n];
        for (int i = 1; i <= n; i++) {
            num[i - 1] = i;
        }

        String[] results = new String[m];
        for (int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            for (int j = 0; j < n; j++) {
                if (x >= values[j][0] && x <= values[j][2]
                        && y >= values[j][1] && y <= values[j][3]) {
                    if (results[i] == null || num[Integer.parseInt(results[i])] < num[j]) {
                        results[i] = String.valueOf(j);
                        System.out.println("第" + (j + 1) + "个窗口显示" + results[i]);
                    }
                }
            }

            int top = 0;
            for (int k = 0; k < n; k++) {
                if (num[k] == n) {
                    top = k;
                }
            }
            if (results[i] == null) {
                results[i] = "IGNORED";
            } else {
                int temp = num[Integer.parseInt(results[i])];
                num[Integer.parseInt(results[i])] = n;
                num[top] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (results[i] != null) {
                results[i] = String.valueOf(Integer.parseInt(results[i]) + 1);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(results[i]);
        }

    }
}




