package 第二十周作业;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/10/18.
 */
public class Wave {
    public static void main(String[] args) {
        int n;
        int b=0,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            b=Math.abs(a[i]-a[i+1]);
            if (b>c){
                c=b;
            }
        }
        System.out.println(c);
    }
}
