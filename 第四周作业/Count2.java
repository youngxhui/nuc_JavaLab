import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/6/16.
 */
public class Count2 {
    public static int countNumberOf2s(int n) {
        // write code here
        int result = 0;
        for(int i=1;i<=n;i*=10)
        {
            result+=(n/i+7)/10*i+(n/i%10==2?n%i+1:0)  ;
        }
        return result;

    }

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();
        System.out.println(countNumberOf2s(count));
    }


}
