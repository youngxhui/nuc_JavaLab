package 算法练习;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/12/5.
 */
public class Step {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        System.out.println(Num(a));
    }

    public static int Num(int a) {
        if (a<2){
            return 1;
        }else {
            return Num(a - 1) + Num(a - 2);
        }
    }
}
