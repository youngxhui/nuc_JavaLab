import java.util.Scanner;
public class LibraryManagerment {
	public static void main(String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int count[]=new int[9999];
		int people[]=new int[n];
		for(int i=0;i<n;i++)
		{
			people[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(++count[people[i]]+" ");
		}
	}
}
