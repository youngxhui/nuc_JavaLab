package Lab;

import java.util.Scanner;

/**
 *
 * Created by Wean on 2016/8/12.
 */
public class Most {
    public int most(int a,int num[]){
        int b;
        int k=-1;
        int c[]=new int[10000];
        int d[]=new int[10000];
        for (int i=0;i<10000;i++){
            c[i]=0;
            d[i]=0;
        }
        for (int i=0;i<a;i++){
            c[num[i]]++;
        }
        b=c[0];
        for (int i=1;i<10000;i++){
           if (b<c[i]){
               b=c[i];
           }
        }
        for(int i=0;i<10000;i++){
            if (c[i]==b){
               k++;
               d[k]=i;
            }
        }
        b=d[0];
        for (int i=1;i<k;i++){
           if (d[i]<b){
               b=d[i];
           }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int[] num=new int[a];
        for (int i=0;i<a;i++){
            num[i]=sc.nextInt();
        }
        Most m=new Most();
        System.out.println(m.most(a,num));
    }
}
