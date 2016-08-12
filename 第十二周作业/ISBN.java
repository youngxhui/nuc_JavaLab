import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/8/11.
 */
public class ISBN {
    public static void main(String[] args) {
        long a1, a2, a3, a4, a5, a6, a7, a8, a9;
        int mod;
        Scanner sc = new Scanner(System.in);
        String isbn;
        isbn = sc.next();
        long ibsnNum = Integer.valueOf(isbn.substring(0, 11).replaceAll("-", ""));
        int ibsnEnd = Integer.valueOf(isbn.substring(12, 13).replaceAll("-", ""));
        System.out.println(ibsnNum);
        System.out.println(ibsnEnd);
        if (Integer.valueOf(isbn.substring(0, 1).replaceAll("-", "")) == 0) {
            a1 = 0;
            a2 = ibsnNum / 10000000;
        } else {
            a1 = ibsnNum / 100000000;
            a2 = ibsnNum / 10000000 % 10;
        }
        a3 = ibsnNum / 1000000 % 10;
        a4 = ibsnNum / 100000 % 10;
        a5 = ibsnNum / 10000 % 10;
        a6 = ibsnNum / 1000 % 10;
        a7 = ibsnNum / 100 % 10;
        a8 = ibsnNum / 10 % 10;
        a9 = ibsnNum % 10;
        mod = (int) (a1 * 1 + a2 * 2 + a3 * 3 + a4 * 4 + a5 * 5 + a6 * 6 + a7 * 7 + a8 * 8 + a9 * 9) % 11;
        if (mod == ibsnEnd) {
            System.out.println("Right");
        } else {
            if (mod == 10) {
                System.out.println(a1 + "-" + a2 + a3 + a4 + "-" + a5 + a6 + a7 + a8 + a9 + "-" + "X");
            } else {
                System.out.println(a1 + "-" + a2 + a3 * +a4 + "-" + a5 + a6 + a7 + a8 + a9 + "-" + mod);
            }
        }
    }
}
