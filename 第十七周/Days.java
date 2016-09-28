package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/9/28.
 */
public class Days {
    public static void main(String[] args) {
        int y, d, m = 1;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        d = sc.nextInt();
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            int a[] = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < 12; i++) {
                if (d >= a[i]) {
                    m++;
                    d = d - a[i];
                }
            }
        } else {
            int a[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for(int i=0;i<12;i++){
                if(d>=a[i]){
                    m++;
                    d=d-a[i];
                }
            }
        }
        System.out.println(m+"\n"+d);
    }

}
