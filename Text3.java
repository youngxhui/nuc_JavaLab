package texts3;

import java.util.Scanner;

public final class Text3 {

	public static int fun(int a, int b) {
		return (a + b + Math.abs(a - b)) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		System.out.println(fun(a, b));
	}

}