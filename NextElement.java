public class NextElement
{
	public int[] findNext(int[] A, int n) 
	{
	  int[] B = new int[n];
      ma: for(int i = 0;i < A.length;i++)
      {
    	  for(int j = i+1;j <= A.length;j++)
    	  {
    		  if(j == A.length)
    		  {
    			  B[i] = -1;
    			  continue ma;
    		  }
    	      else if(A[j] > A[i])
    		  {
    			  B[i] = A[j];
    			 continue ma; 
    		  }
    		  else if(j == A.length-1)
    		  {
    			  B[i] = -1;
    			  continue ma;
    		  }
    	  }
      }
      return B;
	}
	public static void main(String[] args)
	{
		int[] arrays = {11,13,10,5,12,21,3};
		NextElement test = new NextElement();
		int[] array2 = test.findNext(arrays,7);
		for(int k = 0;k < array2.length;k++)
		{
			System.out.println(array2[k]);
		}
	}
}
