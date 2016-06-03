
public class UnusualAdd {
	public int AddAB(int a ,int b)
	{
		if(b==0)
			return a;
		else
			return AddAB(a^b,(a&b)<<1);
	}
	public static void main(String[] args)
	{
		UnusualAdd ua=new UnusualAdd();
		System.out.println(ua.AddAB(1, 2));
	}
}
