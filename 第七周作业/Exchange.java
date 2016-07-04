package renwu;

public class Exchange
{
	public int[] exchangeAB(int[] AB) 
	{
		AB[0]=AB[0]+AB[1];  
        AB[1]=AB[0]-AB[1];  
        AB[0]=AB[0]-AB[1];  
        return AB;
	}
	public static void main(String[] args)
	{
		int[] array = {1,2};
		Exchange test = new Exchange();
		int[] array2 = test.exchangeAB(array);
		for(int i = 0;i < array2.length;i++)
		{
			System.out.println(array2[i]);
		}
	}
}
