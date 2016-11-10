package 第二十一周作业.前缀表达式;

import java.util.Scanner;

/**
 * Created by ASUS on 2016/10/27.
 */
public class Main {
    public static void main(String[] args) {
        int oop1,oop2;
        int result = 0;
        String  option;
        Scanner sc = new Scanner(System.in);
        option = sc.next();
        oop1= sc.nextInt();
        oop2= sc.nextInt();
        switch (option){
            case "+":
                result = oop1 + oop2;
                break;
            case "-":
                result = oop1 - oop2;
                break;
            case "*":
                result = oop1 * oop2;
                break;
            case "/":
                result = oop1 / oop2;
                break;
        }
        System.out.println(result);
    }

}
