import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n;
		m=in.nextInt();
		n=in.nextInt();
		int[][] square=new int[m][n];
		int[][] square1=new int[n][m]; 
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				square[i][j]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				
				square1[i][j]=square[j][n-1-i];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(square1[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
