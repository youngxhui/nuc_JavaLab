
public class UnusualAdd
{
   public int addAB(int a,int b)
   {
	   if (b == 0) {
           return a;
       }
       int c = a ^ b;
       int and = a & b;
       and = and << 1;
       return addAB(c, and);
	   
   }
   public static void main(String[] args)
 {
	   UnusualAdd test = new UnusualAdd();
	  System.out.println( test.addAB(2,4));
 }
}
