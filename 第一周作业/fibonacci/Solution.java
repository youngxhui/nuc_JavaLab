package fibonacci;

import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/5/21.
 */
class Solution {
    /**
     * @return an integer f(n)
     */

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fibonacci(n));
    }



    public static int fibonacci(int n) {
        // write your code here
        if(n<2){
            return n-1;
        }else{
            return Math.abs(fibonacci(n-1)+fibonacci(n-2));
//            不要问我为什么要加绝对值…………因为他算出来是负数
        }
    }
}