public class Robot {
	public int countWays(int x ,int y)
	{
		int A[][]=new int[x][y];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(i-1<0&&j-1<0)
					A[i][j]=1;
				else if(i-1<0)
					A[i][j]=A[i][j-1];
				else if(j-1<0)
					A[i][j]=A[i-1][j];
				else
				A[i][j]=A[i-1][j]+A[i][j-1];
			}
		}
		return A[x-1][y-1];
	}
}
