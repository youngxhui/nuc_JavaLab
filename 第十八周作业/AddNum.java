package 第十八周作业;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/10/5.
 */
public class AddNum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.next();
        int sum = 0;
        int[] b = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            String s0 = a.substring(i, i + 1);
            b[i] = Integer.valueOf(s0);
            sum += b[i];
        }
        System.out.println(sum);
    }
}

