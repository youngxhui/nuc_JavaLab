package 第八周;

/**
 * Created by 吴亚斌 on 2016/7/15.
 */
public class Exchange {
    public int exchangeOddEven(int x) {
        int y;
        y=x>>1;
        return y;
    }

    public static void main(String[] args) {
        Exchange a=new Exchange();

        System.out.println(a.exchangeOddEven(10));
    }
}
