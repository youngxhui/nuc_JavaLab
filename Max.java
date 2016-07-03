import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max
{
    public int getMax(int a,int b)
    {
      List<Integer> list = new ArrayList<Integer>();   	
      list.add(a);
      list.add(b);
      Collections.sort(list);
  
      return list.get(1);
    }
    public static void main(String[] args)
	{
		Max test = new Max();
		System.out.println(test.getMax(1,2));
	}
}
