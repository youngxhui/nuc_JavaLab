package Lab;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Wean on 2016/8/12.
 */
public class Bianma {
    public static void main(String[] args) {
        String a;
        int sum=0;
        int k;
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        int[] b=new int[10];
        String n;
        n=String.valueOf(a.substring(0,13).replaceAll("-",""));
        for(int i=0;i<n.length();i++)
        {
            String s0=n.substring(i,i+1);
            b[i]=Integer.parseInt(s0);
        }
        for (int i=0;i<9;i++){
            sum+=b[i]*(i+1);
        }
        k=sum%11;
        if (k==b[9]){
            System.out.println("Right");
        }else {
            for (int i=0;i<9;i++){
                if (i==1||i==4){
                    System.out.print("-");
                }
                System.out.print(b[i]);
            }
            System.out.print("-");
            System.out.println(k);

        }

    }
}
