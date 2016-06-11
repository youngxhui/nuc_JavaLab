public class Count2 {
	public int countNumberOf2s(int n)
	{
		int x=0;
		for(int i=0;i<=n;i++)
		{
			String s=Integer.toString(i);
			char[] str=s.toCharArray();
			for(int j=0;j<str.length;j++)
			{
				
				if(str[j]=='2')
					x++;
			}
		}
		return x;
	}
}
