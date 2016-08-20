package 十二周work;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/8/14.
 * 给定N个正整数，找出他们中出现次数最多的数，如果多个输出最小的。
 */
public class MostTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[10001];
        for (int i=0;i<n;i++){
            ++a[sc.nextInt()];
        }
        int max=0;
        int maxCount=-1;
        for (int i=1;i<10001;i++){
            if(a[i]>max) {
                max = a[i];
                maxCount=i;
            }
        }
        System.out.println(maxCount);
    }
}
