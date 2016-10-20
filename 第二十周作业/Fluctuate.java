package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/10/18.
 */
public class Fluctuate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max = 0;
        int f[]=new int[n];
        int b[]=new int[n-1];
        for (int i = 0; i < n; i++) {
            f[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (f[i]<f[i+1]){
                b[i]=f[i+1]-f[i];
            }else {
                b[i]=f[i]-f[i+1];
            }
        }
        for (int i = 0; i < n-2; i++) {
            if (b[i]>b[i+1]){
                max=b[i];
            }else {
                max=b[i+1];
            }
        }
        System.out.println(max);
    }
}
