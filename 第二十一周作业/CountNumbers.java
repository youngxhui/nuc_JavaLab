import java.util.Scanner;
/**
 * Created by Tyranitarx on 2016/10/31.
 */
public class CountNumbers {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        int number=0;
        n=in.nextInt();
        int a[]=new int[n];
        int base[]=new int[1025];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            base[a[i]]++;
        }
        for(int i=1;i<1025;i++){
            if(base[i]>number){
                number=i;
            }
        }
        System.out.print(number);
    }
}
