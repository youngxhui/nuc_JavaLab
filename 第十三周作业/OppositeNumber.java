import  java.util.*;
public class OppositeNumber {
	public int CountNum(){
		Scanner in=new Scanner(System.in);
		int num,count=0;
		num=in.nextInt();
		int[] a=new int[501];
		int [] Num=new int[num];
		for(int i=0;i<Num.length;i++){
			Num[i]=in.nextInt();
			}
		for(int i=1;i<Num.length;i++){
			a[Math.abs(Num[i])]++;
		}
		for(int i=1;i<501;i++){
			if(a[i]>1){
				
				count++;
			}
		}
		return count;
	}
	
}
