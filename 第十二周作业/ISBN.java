package 十二周work;

import java.util.Scanner;

/**
 * Created by 吴亚斌 on 2016/8/15.
 */
public class ISBN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ss=s.replace("-","");
        int l=Integer.parseInt(ss);
        int[] a=new int[9];
        int sum=0;
        for (int i=0;i<9;i++){
            a[i]=Integer.parseInt( String.valueOf(ss.charAt(i)));
            sum=sum+a[i]*(i+1);
        }
        int mod=sum%11;
        System.out.println(mod);
        if (mod==Integer.parseInt( String.valueOf(ss.charAt(9)))){
            System.out.println("Right");
        }
        else {
            if (mod==10&&(ss.charAt(9))=='x'){
                System.out.println("Right");
            }
            else {
                if (mod==10){
                    for (int i=0;i<9;i++)
                        System.out.print(a[i]);
                    System.out.print("x");
                }
                else {
                    for (int i=0;i<9;i++)
                    System.out.print(a[i]);
                    System.out.print(mod);
                }
            }
        }
    }
}
