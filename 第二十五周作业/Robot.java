
public class Robot {
	 public int countWays(int x, int y) {  
	        
	        int dp[][]=new int[x][y];  
	        dp[0][0] = 0;                      //从(0,0)开始。  
	        for(int i = 0;i < x;i ++){  
	            dp[i][0] = 1;                  //因为机器人向下走，我将其都标记为一代表到这里仅仅需要一次；  
	        }  
	        for(int i = 0;i < y;i ++){  
	            dp[0][i] = 1;                   //因为机器人向右走，我将其都标记为一代表到这里仅仅需要一次  
	        }  
	        for(int i = 1;i < x;i ++){  
	            for(int j = 1;j < y;j ++){  
	                dp[i][j] = dp[i-1][j] + dp[i][j-1];//走到(i,j)则有上一步和左一步  
	            }  
	        }  
	        return dp[x-1][y-1];  
	    }  
	 
	 
	 public static void main(String[] args) {
		Robot r = new Robot();
		System.out.println(r.countWay(3,3));
	}
	 
	 
	 public int countWay(int x, int y) {  
	         
	        if(x==1||y==1){  
	            return 1;  
	        }  
	        return countWays(x-1,y)+countWays(x,y-1);  
	    }  

}
