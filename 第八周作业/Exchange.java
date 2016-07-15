/**
 * Created by 晓辉 on 2016/7/15.
 *请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）
 *给定一个int x，请返回交换后的数int。
 */
public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
        int oddVal = (x & 0xAAAAAAAA); // bit 1 3 5 ... 31
        int evenVal = (x & 0x55555555); // bit 0 2 4 ... 30
        return (oddVal >> 1) + (evenVal << 1);


    }
}
