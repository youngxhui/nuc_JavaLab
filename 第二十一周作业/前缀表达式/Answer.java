package 第二十一周作业.前缀表达式;

import java.util.*;
import java.util.ArrayList;

public class Answer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 20) System.exit(0);
        if (n <= 0) System.exit(0);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int[] count = new int[n];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1;
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    count[i]++;
                }
            }
        }
        int num = 1;
        for (int i = 0; i < count.length; i++) {
            if (num < count[i]) {
                num = count[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < count.length; i++) {
            res.add(count[i]);
        }
        int weishu = res.indexOf(num);
        System.out.println(a[weishu]);
        in.close();
    }
}