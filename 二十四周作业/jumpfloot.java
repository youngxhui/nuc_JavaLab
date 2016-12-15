import java.util.Scanner;

public class jumpfloor {
	 
	/*
	 * 小青蛙每一步跳跃只有两种选择：一是再跳一级阶梯到达第 i 级阶梯，此时小青蛙处于第 i-1 级阶梯；或者再跳两级阶梯到达第 i 级阶梯，此时小青蛙处于第 i-2 级阶梯。

于是，i 级阶梯的跳法总和依赖于前 i-1 级阶梯的跳法总数f(i-1)和前 i-2 级阶梯的跳法总数f(i-2)。因为只有两种可能性，所以，f(i)=f(i-1)+f(i-2);

依次类推，可以递归求出n级阶梯跳法之和。
	 */
	public static void main(String[] args) {
		int  n = 10;
		jumpfloor jf = new jumpfloor();
		System.out.println(jf.jump(n));
	}
	public int jump(int n)
	{
		int i[] = {0,1,2};
		
		if(n<0){
			System.out.println("输入的楼梯数有误！退出");
			return 0;
		}	
		if(n<3)
		{
			return i[n];
		}else{
			return jump(n-1)+jump(n-2);
		}
	}

}
