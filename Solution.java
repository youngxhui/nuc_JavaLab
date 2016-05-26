package 实验室每周一练;

import java.util.Scanner;

public class Solution {
	public static int fibonacci(int n){
		if(n<3)
			return n-1;
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		while(true){
			x=sc.nextInt();
			System.out.println(fibonacci(x));
		}
	}

}
