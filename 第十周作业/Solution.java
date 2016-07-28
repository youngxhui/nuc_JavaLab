public class Solution{
	public long jumpFloorII(int n) {
    	if (n <= 0)
        	return -1;
    	if (n == 1)
        	return 1;
    	return 2 * jumpFloorII(n - 1);
	}
}