import java.util.Scanner;

/**
 * Created by ASUS on 2016/9/18.
 *
 */
public class picT {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] pic = new int[n][m];
        int[][] picT = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pic[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                picT[i][j]=pic[j][n-i];
                System.out.print(picT[i][j]);
            }
            System.out.println();
        }
    }
}
