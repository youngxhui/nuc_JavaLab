import javax.activation.MailcapCommandMap;

import shnegsiyuan.MianTest;

public class Board
{
      public boolean checkWon(int[][] board)
      {
    	  if(board[0][0]+board[0][1]+board[0][2] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[1][0]+board[1][1]+board[1][2] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[2][0]+board[2][1]+board[2][2] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[0][1]+board[1][1]+board[2][1] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[0][0]+board[1][0]+board[2][0] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[0][2]+board[1][2]+board[2][2] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[0][0]+board[1][1]+board[2][2] == 3)
    	  {
    		  return true;
    	  }
    	  else if(board[0][2]+board[1][1]+board[2][0] == 3)
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
    	  
      }
      public static void main(String[] args)
	{
		int[][] a = {{1,0,1},{1,-1,-1},{1,-1,0}};
		Board test = new Board();
		System.out.println(test.checkWon(a));
	    	
	}
      
}
