package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/9/20.
 */
public class Xuanzhuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[n][m];

        for (int i=0;i<m;i++){
            for (int z=0;z<n;z++){
                a[i][z]=sc.nextInt();
            }
        }

        int k=0;
            for (int r=n-1;r>=0;r--){
                for (int j=0;j<m;j++){
                    b[k][j]=a[j][r];
                    System.out.print(b[k][j]+" ");
                }
                k++;
                System.out.println();
            }

    }
}
