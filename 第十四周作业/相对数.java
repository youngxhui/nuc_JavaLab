import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/27.
 *
 */
public class 相对数 {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (Math.abs(a[i]-a[j])==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
