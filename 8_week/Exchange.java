public class Exchange {

	public int exchangeOddEven(int x) {
		//偶位右移
		int a = (x&0b10101010101010101010101010101010)>>1;
        //奇位左移
        int b = (x&0b01010101010101010101010101010101)<<1;
        //取或运算
        return a|b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchange e=new Exchange();
		System.out.println(e.exchangeOddEven(10));

	}

}
