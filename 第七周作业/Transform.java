package renwu;

public class Transform
{
	public int calcCost(int A, int B) 
	{
		 int count = 0;
         String str1 = Integer.toBinaryString(A);
         String str2 = Integer.toBinaryString(B);
         char[] ch3 = str1.toCharArray();
         char[] ch4 = str2.toCharArray();
         int[] ch1 = new int[ch3.length];
         int[] ch2 = new int[ch4.length];
         for(int k = 0; k < ch1.length;k++)
         {
        	 ch1[k] = Integer.parseInt(String.valueOf(ch3[k]));
         }
         for(int w = 0;w < ch4.length;w++)
         {
        	 ch2[w] = Integer.parseInt(String.valueOf(ch4[w]));
         }
         if(ch1.length > ch2.length)
         {
           int a = ch1.length - ch2.length ;
           count = a;
           for(int i = 0;i < ch2.length;i++)
           {
        	  if(ch1[a+i] != ch2[i])
        	  {
        		  count++;
        	  }
           }
           return  count;
         }
         else
         {
        	 int a = ch1.length - ch2.length ;
             count = a;
           for(int j = 0;j < ch1.length;j++)
           {
        	  if(ch2[a+j] != ch1[j])
        	  {
        		  count++;
        	  }
           }
           return  count;
         }
	}
	
	
	public static void main(String[] args)
	{
		Transform test = new Transform();
		System.out.println(test.calcCost(10,5));
	}
	
	
	
	
	
	
	
	
	
	
	
}
