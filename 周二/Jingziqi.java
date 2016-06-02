package ÖÜ¶ş;

public class Jingziqi {
    public static boolean chenkWon(int[][] board) {
        if (board[0][0]+board[1][1]+board[2][2]==3)
            return true;
        if (board[0][2]+board[1][1]+board[2][0]==3)
            return true;
        for (int i = 0; i <3 ; i++) {
            if (board[i][0]+board[i][1]+board[i][2]==3)
                return true;
            if (board[0][i]+board[1][i]+board[2][1]==3)
                return true;
        }
        
		return (Boolean) null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board=new int[][]{{1,0,1},{1,-1,-1},{1,-1,0}};
		Jingziqi jzq=new Jingziqi();
		System.out.println("Ó®¼Ò£º"+jzq.chenkWon(board));
	}

}
