package renwu;

public class Exchange2
{
	public int exchangeOddEven(int x)
	{
		int oddVal = (x & 0xAAAAAAAA); 
        int evenVal = (x & 0x55555555); 
        return (oddVal >> 1) + (evenVal << 1);
	}
	public static void main(String[] args)
	{
		Exchange2 test = new Exchange2();
		System.out.println(test.exchangeOddEven(10));
	}
}
