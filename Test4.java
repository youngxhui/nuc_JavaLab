public class Test4
{
   public int t(String[] array,String word)
   {
	 int count = 0;  
	 for(int i = 0;i < array.length;i++)
	 {
		 if(array[i] == word)
		 {
			 count++;
		 }
	 }
	 return count;
   }
   public static void main(String[] args)
  {
	 String[] array = {"abc","out","abc","kbs","khc","is","abc"};
	 Test4 test = new Test4();
	 System.out.println(test.t(array,"abc"));
  }
}
