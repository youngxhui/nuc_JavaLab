package task1;

import java.util.Scanner;

public class TestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		while(true){
		System.out.println("请输入一个正整数：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print("第"+n+"个斐波那契数为:");
		System.out.println(s.fibonacci(n));
        
        
		
		}
	}

}
