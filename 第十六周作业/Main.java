package 十六周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/9/20.
 */
public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int x=sc.nextInt();

        int[][] a=new int[1000][1000];
        for (int i=0;i<y;i++){
            for (int j=0;j<x;j++){
                a[i][j]=sc.nextInt();
            }

        }
        for(int i=x-1;i>=0;i--){
            for(int j=0;j<y;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
