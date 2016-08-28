import java.util.*;
public class ISBN {
	public String JudgeISBN(){
		Scanner in=new Scanner(System.in);
		String ISBN;
		int sum=0;
		char num2[] = new char[3];
		char num3[] = new char[5];
		ISBN=in.next();
		String[] NUM=ISBN.split("-");
		sum=sum+Integer.parseInt(NUM[0]);
		for(int i=0;i<3;i++){
			num2[i]=NUM[1].charAt(i);
		}
		for(int i=0;i<5;i++){
			num3[i]=NUM[2].charAt(i);
		}
		sum=sum+Integer.parseInt(num2[0]+"")*2+Integer.parseInt(num2[1]+"")*3+Integer.parseInt(num2[2]+"")*4+Integer.parseInt(num3[0]+"")*5+Integer.parseInt(num3[1]+"")*6+Integer.parseInt(num3[2]+"")*7+Integer.parseInt(num3[3]+"")*8+Integer.parseInt(num3[4]+"")*9;
		sum=sum%11;
		if(Integer.parseInt(NUM[3])==sum)
			return "Right";
		else if(sum==10){
			if(NUM[3].equals("X"))
				return "Right";
			else
				NUM[3]="X";
		}
		else {
			NUM[3]=sum+"";
			
		}
		return NUM[0]+"-"+NUM[1]+"-"+NUM[2]+"-"+NUM[3];
	}
}
