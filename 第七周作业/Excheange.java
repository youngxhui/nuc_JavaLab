import java.util.Scanner;
public class Exchange {
	public int[] exchange(int [] AB)
	{
		AB[0]=AB[0]+AB[1];
		AB[1]=AB[0]-AB[1];
		AB[0]=AB[0]-AB[1];
		return AB;
	}

}
