package 第二十四周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/12/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tiao(n));

    }
    static int tiao(int n ){
        if (n==2)
            return 2;
        if (n==1)
            return 1;
        else
            return tiao(n-1)+tiao(n-2);
    }
}
