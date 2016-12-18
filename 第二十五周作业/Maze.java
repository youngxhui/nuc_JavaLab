package 算法练习;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/12/18.
 * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
 * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
 */
public class Maze {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sum = run(x, y);
        System.out.println(sum);
    }


    static int run(int x, int y) {
        if (x < 0 || y < 0 || x + y > 12) {
            return 0;
        }
        if (x < 2 || y < 2) {
            return 1;
        } else {
            return run(x - 1, y) + run(x, y - 1);
        }
    }
}
