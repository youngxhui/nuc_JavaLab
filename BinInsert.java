public class BinInsert 
{
    public int binInsert(int n, int m, int j, int i) 
    {
         m=m<<(j);
         return n+m;
    }
    public static void main(String[] args)
	{
    	BinInsert test = new BinInsert();
    	System.out.println(test.binInsert(1024,19,2,6));
	}
}
