import java.util.Scanner;

public class Zcount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k;
		k = in.nextInt();
		int form[][] = new int[k][k];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				form[i][j] = in.nextInt();
			}
		}
		for (int count = 0; count <=2*(k-1); count++) {
			if ((count%2) != 0) {
				for (int i = 0; i < k; i++) {
					for (int j = 0; j < k; j++) {
						if (i + j == count)

							System.out.print(form[i][j]+" ");

					}
				}
			} else {
				for (int i = k - 1; i >= 0; i--) {
					for (int j = k - 1; j >= 0; j--) {
						if (i + j == count)
							System.out.print(form[i][j]+" ");
					}
				}
			}
		}
	}
}
