package 实验室每周一练;

public class ways {
	
		public int countWays(int n)
		{
			int[] coins={1,5,10,25};
	        int[] dp = new int[100002];  
	        dp[100001] = 0;
	        dp[0] = 1;
	        for(int i = 0;i < 4;++i)
	        {
	            for(int j = coins[i];j <= n;++j)
	            {
	                dp[j] =(dp[j]+dp[j-coins[i]])%1000000007;               
	            }
	        }
	        return dp[n];
	       
	    }
		public static void main(String[] args)
		{
			ways test = new ways();
			System.out.println(test.countWays(6));
		}
	}