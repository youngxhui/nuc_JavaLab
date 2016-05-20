
public class FibonacciSolution {
	public int fibonacci(int n)
	{
		int[] number=new int[n];
		number[0]=0;
		if(n>1)
			number[1]=1;
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else {
		for(int i=2;i<n;i++)
		{
			number[i]=number[i-1]+number[i-2];
		}
		}
		return number[n-1];
	}
}
