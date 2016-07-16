public class AddSubstitution {
	public int calc(int a,int b,int type)
	{
		int cal=0;
		switch(type)
		{
		case 1:
			for(int i=0;i<b;i++)
			{
				cal=cal+a;
			}
			return cal;
		case 0:
			for(int i=0;;i++)
			{
				if(a<=0)
					break;
				else
				{
					a=calc(a,b,-1);
					cal++;
				}
			}
			return cal;
		case -1:
			return a+~b+1;
		
		}
		return cal;
	}
}
