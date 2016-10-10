package 第十七周作业;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/10/10.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] a={31,28,31,30,31,30,31,31,30,31,30,31},b={31,29,31,30,31,30,31,31,30,31,30,31};
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=0,day=0;
        int sum=0;
        int num=sc.nextInt();
        if ((year%4==0&&year%4!=0)||year%400==0){

            for (int i=0;i<12;i++){
                if(sum+b[i+1]>num){
                    System.out.println(i+1);
                    System.out.println(num-sum);
                    break;
                }
                sum=sum+a[i];
            }
        }
        else {
            for (int i=0;i<12;i++){
                if(sum+a[i+1]>num){
                    System.out.println(i+1);
                    System.out.println(num-sum);
                    break;
                }
                sum=sum+a[i];
            }
        }

    }



    }

