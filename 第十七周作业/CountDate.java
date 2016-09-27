import java.util.Scanner;
public class CountDate {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int y,d;
		int monthr[]={31,29,31,30,31,30,31,31,30,31,30,31};
		int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int month1 = 0;
		y=in.nextInt();
		d=in.nextInt();
		if(y%4==0&&y%100!=0||y%400==0){
			for(int i=0;i<monthr.length;i++){
				if(d>=monthr[i])
				d=d-monthr[i];
				if(d<monthr[i+1])
				{
					month1=i+2;
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<month.length;i++){
				if(d>=month[i])
				d=d-month[i];
				if(d<month[i+1])
				{
					month1=i+2;
					break;
				}
			}
		}
		System.out.println(month1);
		System.out.println(d);
	}
}
