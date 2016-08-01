import java.util.Scanner;

public class fibonacci {
	
	static long func(long n)
	{
		if(n == 1 )
			return 0;
		else if(n == 2)
			return 1;
		else 
			return func(n - 1) + func(n - 2);   //”√µ›πÈ
	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
				long n = s.nextLong();
				System.out.println(func(n));
	}
               
}
