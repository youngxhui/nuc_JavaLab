public class Solution{
	public long jumpFloor(int n) {
    	if (n <= 0)
        	return -1;
    	if (n == 1)
        	return 1;
    	return 2 * jumpFloor(n - 1);
	}
}