import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/6/2.
 */
public class Max {
    public static int getMax(int a, int b){
        return (a+b+Math.abs(a-b))/2;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(getMax(a,b));

    }
}
