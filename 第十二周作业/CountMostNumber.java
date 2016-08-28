import java.util.*;
public class CountMostNumber {
	public int getMost(){
		int[] CountNum=new int[10010];
		int kind,max,Most = 0,num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=0;i<num;i++){
			kind=in.nextInt();
			CountNum[kind]++;
		}
		max=0;
		for(int i=0;i<10000;i++){
			if(CountNum[i]>max){
				max=CountNum[i];
				Most=i;
			}
			else if(CountNum[i]==max){
				if(i<Most){
					Most=i;
				}
			}
		}
		return Most;
	}
}
