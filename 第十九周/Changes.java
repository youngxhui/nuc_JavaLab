package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/10/12.
 */
public class Changes {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i - 1] < a[i]) {
                if (a[i] > a[i + 1]) {
                    count++;
                }
            }
            else {
                if (a[i] < a[i + 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
