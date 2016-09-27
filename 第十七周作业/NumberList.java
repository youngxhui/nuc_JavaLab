import java.util.Scanner;
public class NumberList {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		int a,b;
		int c=1;
		int NumberList[]=new int[n];
		for(int i=0;i<n;i++){
			NumberList[i]=in.nextInt();
		}
		for(int i=1;i<n;i++){
			a=NumberList[i-1];
			b=NumberList[i];
			if(a!=b)
				c++;
		}
		System.out.println(c);
	}
}
