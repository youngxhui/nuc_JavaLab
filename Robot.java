public class Robot {
	
	public int countWays(int x, int y) {
	  //代码是参考张鑫同学写的,原计划用二叉树,但是效率不如这个高
		int A[][]=new int[x][y];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(i==0&&j==0) A[i][j]=1;
				else if(i==0)A[i][j]=A[i][j-1];
				else if(j==0)A[i][j]=A[i-1][j];
				else A[i][j]=A[i-1][j]+A[i][j-1];
			}
		}
		return A[x-1][y-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r=new Robot();
		System.out.print(r.countWays(11, 11));

	}

}
