package 实验室每周一练;

public class Board {
	public boolean CheckWin(int[][] b){
		
		for(int i=0;i<3;i++){
			
			int sum=b[i][0]+b[i][2]+b[i][1];
			if(sum==3)
				return true;
		}		
		for(int i=0;i<3;i++){
			
			int sum=b[0][i]+b[1][i]+b[2][i];
			if(sum==3)
				return true;
		}
		int sum1=b[0][0]+b[1][1]+b[2][2];
		int sum2=b[0][2]+b[1][1]+b[2][0];
		if(sum1==3||sum2==3)
			return true;
		return false;
	}
	public  static void  main(String arg[]){
		int[][] b={{1,0,1},{1,-1,-1},{1,-1,0}};
		Board x=new Board();
		System.out.println(x.CheckWin(b));
	}
}