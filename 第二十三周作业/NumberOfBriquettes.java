package 第二十三周作业;

/**
 * Created by ASUS on 2016/11/10.
 */
public class NumberOfBriquettes {
    public static void main(String[] args) {

        int sum = 1;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
