package 第二十一周作业.前缀表达式;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/10/27.
 */
public class MainNext {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        int counts=0;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i; j < a.length; j++) {
                if (a[i]==a[j]){
                    count++;
                }
            }
            if (count>=counts){
                counts=count;
                n = a[i];
            }

        }
        System.out.println(counts);
        System.out.println(n);
    }

}
