package 第十七周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/10/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] sur=new int[1000];
        int subNum=1;
        for (int i=0;i<x;i++)
            sur[i]=sc.nextInt();
        for (int i=0;i<x-1;i++){
            if(sur[i]!=sur[i+1])
                subNum=subNum+1;
        }
System.out.println(subNum);
    }
}
