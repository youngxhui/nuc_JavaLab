package renwu;

public class Solution
{
	
    public int fibonacci(int n)
    {
    	int a = 1;
    	int b = 1;
    	int sum = 1;
    	if(n == 1)
    	{
    		return 0;
    	}
    	else if(n == 2 || n == 3)
    	{
    		return 1;
    	}
    	else
    	{
    		for(int i = 4;i <= n;i++)
    		{
    			sum =  a+b;
    			b = a;
    			a = sum;
    		}
    		return sum;
    	}
    }
    public static void main(String[] args)
	{
		Solution test = new Solution();
		System.out.println(test.fibonacci(5));
		System.out.println(test.fibonacci(6));
		System.out.println(test.fibonacci(7));
		
	}
}
