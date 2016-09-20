import java.util.*;
public class Count {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n;
		int count=0;
		n=in.nextInt();
		int countNumber[]=new int[1001];
		
		int number[]=new int[n];
		for(int i=0;i<n;i++){
			number[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			countNumber[number[i]]++;
		}
		
		for(int i=1;i<1001;i++){
			if(countNumber[i]!=0){
				count++;
				
			}
		}
		int uppercasen[]=new int[count];
		int uppercasec[]=new int[count];
		for(int i=1,j=0;i<1001;i++){
			if(countNumber[i]!=0){
				uppercasen[j]=i;
				uppercasec[j]=countNumber[i];
				j++;
			}
		}
		for(int i=0;i<count;i++){
			for(int j=i;j<count;j++)
			{
				int temp;
				if(uppercasec[i]<uppercasec[j]){
					temp=uppercasec[i];
					uppercasec[i]=uppercasec[j];
					uppercasec[j]=temp;
					temp=uppercasen[i];
					uppercasen[i]=uppercasen[j];
					uppercasen[j]=temp;
				}
				if(uppercasec[i]==uppercasec[j]){
					if(uppercasen[i]>uppercasen[j]){
						temp=uppercasen[i];
						uppercasen[i]=uppercasen[j];
						uppercasen[j]=temp;
					}
						
				}
			}
		}
		for(int i=0;i<count;i++){
			System.out.println(uppercasen[i]+" "+uppercasec[i]);
		}
	}
}
