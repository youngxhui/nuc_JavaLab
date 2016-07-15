import java.util.*;

public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
          int a = (x&0b10101010101010101010101010101010)>>1;
               //获取奇数位并左移一位
                int b = (x&0b01010101010101010101010101010101)<<1;
                //两者进行或运算得到结果
                return a|b;
    }
}