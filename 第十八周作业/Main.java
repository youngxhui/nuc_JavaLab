package 第十八周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/10/10.
 */
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int next=-1,end=-1,sum=0;
        while (num!=0){
            next=num/10;
            end=num%10;
            sum=sum+end;
            num=next;
        }
        System.out.println(sum);
    }
}
