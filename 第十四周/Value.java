package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/8/29.
 */
public class Value {




    public int init(int a,int b[]){
        int c=0;
        for (int i = 0; i <a ; i++) {
            for (int j=i+1;j<a;j++){
                if ((b[i]-b[j]==1)||(b[i]-b[j]==-1)){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b[]=new int[a];
        for (int i = 0; i <a ; i++) {
            b[i]=sc.nextInt();
        }
        Value value=new Value();
        System.out.println(value.init(a,b));
    }
}
