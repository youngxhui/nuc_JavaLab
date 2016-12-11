package githubtax;

public class Solution {
	public int sum=0;
	
	public int fb(int i)
	{
		if(i<3)
		{
			return 1;
		}
		else 
			return fb(i-1)+fb(i-2);
	}
	
	public static void main(String[] args)
	{
		Solution a = new Solution();
		System.out.println(a.fb(10));
	}
}
