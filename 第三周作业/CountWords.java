
public class CountWords {
	public int Count(String[] article,int n,String word)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(article[i].equals(word))
				count++;
		}
		return count;
	}
}
