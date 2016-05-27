
public class Board {
	public boolean checkWon(int[][] board)
	{
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(board[i][j]!=1)
				break;
			if(j==board[0].length-1)
				return true;
				
		}
	}
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(board[j][i]!=1)
				break;
			if(j==board[0].length-1)
				return true;
				
		}
	}
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(i==j)
			{
				if(board[i][j]!=1)
					break;
				if(i==board.length-1)
					return true;
			}
		}
	}
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(i==board.length-1-j)
			{
				if(board[i][j]!=1)
					return false;
				if(i==board.length-1)
					return true;
			}
				
		}
	}
	return false;
	
}
}
