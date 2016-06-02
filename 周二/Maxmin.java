package 周二;

import java.util.Scanner;

public class Maxmin {
	public int bijiao(int a,int b){
		int z = a - b;
	    int k = (z>>31) & 1;
	    return (a - k * z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个整数");
		int a,b;
		Maxmin m=new Maxmin();
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("较大值为"+m.bijiao(a, b));
	}

}
