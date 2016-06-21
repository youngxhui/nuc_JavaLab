public class NextElement {
	public int[] findNext(int[] A,int B)
	{
		int temp=0;
		for(int i=0;i<B;i++)
		{
			temp=A[i];
			for(int j=i;j<B;j++)
			{
				if(A[j]>A[i])
				{
					A[i]=A[j];
					break;
				}
				
			}
			if(A[i]==temp)
				A[i]=-1;
		}
		return A;
	}
}
