package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/9/28.
 */
public class Split {
    public static void main(String[] args) {
        int a[]=new int[1000];
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int d=a[0];
        int m=1;

        for(int i=1;i<n;i++){
            if(a[i]!=d){
                m++;
                d=a[i];
            }
        }
        System.out.println(m);
    }
}
