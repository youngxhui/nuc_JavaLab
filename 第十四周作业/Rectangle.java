package 第十四周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/8/28.
 */
public class Rectangle {
    public static void main(String[] args) {
        int[][] a=new int[100][100];
        Scanner sc=new Scanner(System.in );
        int num=sc.nextInt();
        int x1,x2,y1,y2;
        int area=0;
        for (int i=0;i<num;i++){
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            for(int l=Math.min(x1,x2);l<=Math.max(x1,x2);l++){
                for (int k=Math.min(y1,y2);k<=Math.max(y1,y2);k++){
                    a[l][k]++;
                }
            }
        }
        for (int i=0;i<101;i++){
            for (int k=0;i<101;i++){
                if(a[i][k]!=0)
                    area++;
            }
        }
    }
}
