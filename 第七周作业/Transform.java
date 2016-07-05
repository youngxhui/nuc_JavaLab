
public class Transform {
	public int calcCost(int a ,int b)
	{
		int count=0;
		String temp;
		String x=Integer.toBinaryString(a);
		String y=Integer.toBinaryString(b);
		if(x.length()<y.length())
		{
			temp=x;
			x=y;
			y=temp;
		}
		for(int i=0;i<x.length()-y.length();i++)
		{
			y="k"+y; 
			
		}
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=y.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	
}
