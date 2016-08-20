import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/20.
 */
public class oppositeNumber {
    public static void main(String[] args) {
        int a;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < (arr.length) / 2; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == -arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
