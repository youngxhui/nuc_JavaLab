package 第十三周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/8/20.
 */
public class OppositeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int onum=0;
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[i]+a[j]==0)
                    onum++;
            }
        }
        System.out.print(onum);
    }
}
