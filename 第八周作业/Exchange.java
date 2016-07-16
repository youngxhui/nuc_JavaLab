public class Exchange {
	public int exchangeOddEven(int x)
	{
		String x1=Integer.toBinaryString(x);	
		String[] x2=x1.split("");
		String temp=null;
		for(int i=x2.length-1;i>=0;i--)
		{
			if((i+1)%2==0)
			{
				
				temp=x2[i];
				x2[i]=x2[i-1];
				x2[i-1]=temp;
			}
		}
		int k=0,x3=0;
		for(int i=x2.length-1;i>=0;i--)
		{
			x3=(int) (x3+Integer.parseInt(x2[i])*Math.pow(2,k));
			k++;
		}
			return x3;
	}
}
