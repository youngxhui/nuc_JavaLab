package renwu;

public class Replacement
{
	public String replaceSpace(String iniString, int length) 
	{
		String str = "";
		if(length > 1000)
		{
			return "³¤¶ÈÌ«³¤";
		}
		String[] arr = iniString.split(" ");
		String[] arr2 = new String[arr.length*2];
		for(int i = 1,j=0;j < arr.length;i +=2,j++ )
		{
			arr2[i] = arr[j];
		}
		for(int i = 0; i < arr2.length;i += 2)
		{
			arr2[i] = "%20";
		}
		for(int i = 0; i< arr2.length;i++)
		{
			str += arr2[i];
		}
		return str.substring(3);
	}
	public static void main(String[] args)
	{
		Replacement test = new Replacement();
		System.out.println(test.replaceSpace("Mr John Smith",13));
	}
}
