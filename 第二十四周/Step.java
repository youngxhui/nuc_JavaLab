package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/12/6.
 */
public class Step {
    public int fun(int a){
        if (a<2){
            return 1;
        }
        else {
            return fun(a-1)+fun(a-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(new Step().fun(sc.nextInt()));
    }
}
