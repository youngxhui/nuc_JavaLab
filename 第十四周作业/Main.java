import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/27.
 *
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    public  void run() {
        int [][] matrix_N_N = new int[100][100]; //定义100阶方矩阵
//默认开始是全部置0的，若不是就自己在此加入矩阵初始化。
        int x1,y1,x2,y2,cnt=0;
        Scanner fin = new Scanner(System.in);
        int N = fin.nextInt();
        int [][] matrix_N_4 = new int[N][4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <4; j++) {
                matrix_N_4[i][j] = fin.nextInt();
            }
            x1=matrix_N_4[i][0];
            y1=matrix_N_4[i][1];
            x2=matrix_N_4[i][2];
            y2=matrix_N_4[i][3];
            for (int k = x1; k < x2; k++) {//标记相应点
                for (int w = y1; w < y2; w++) {
                    matrix_N_N[k][w]=1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {//统计标志点的个数
            for (int j = 0; j < 100; j++) {
                if (matrix_N_N[i][j]==1) {
                    cnt++;
//     System.out.print("("+i+","+j+");");
                }
            }
        }
        System.out.println(cnt); //打印结果
        fin.close();
    }
}