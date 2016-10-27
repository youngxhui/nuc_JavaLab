package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/10/26.
 */
public class Yunsuan {
    public int add(String a[]){
        return Integer.parseInt(a[1])+Integer.parseInt(a[2]);
    }
    public int del(String a[]){
        return Integer.parseInt(a[1])-Integer.parseInt(a[2]);
    }
    public int mul(String a[]){
        return Integer.parseInt(a[1])*Integer.parseInt(a[2]);
    }
    public int div(String a[]){
        return Integer.parseInt(a[1])/Integer.parseInt(a[2]);
    }
    public static void main(String[] args) {
        String a[]=new String[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i]=sc.next();
        }
        Yunsuan y=new Yunsuan();
        if (a[0].equals("+")){
            System.out.println(y.add(a));
        }
        else if (a[0].equals("-")){
            System.out.println(y.del(a));
        }
        if (a[0].equals("*")){
            System.out.println(y.mul(a));
        }
        if (a[0].equals("/")){
            System.out.println(y.div(a));
        }
    }
}
