public class Replacement {
	public String ReplaceSpace(String initString ,int length)
	{
		String init1[]=initString.split("");
		String init2="";
		for(int i=0;i<length;i++)
		{
			if(init1[i].equals(" "))
			{
				init1[i]="%20";
			}
		}
		for(int i=0;i<init1.length;i++)
		{
			init2=init2+init1[i];
		}
		return init2;
	}
}
