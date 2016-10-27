package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/10/27.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        int b=0,value=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            int k=0;
            for (int i = j+1; i < n; i++) {
                if (a[j]==a[i]){
                    k++;
                }
            }
            if (b<k){
                b=k;
                value=j;
            }

        }
        System.out.println(a[value]);
    }
}
