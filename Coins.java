public class Coins {
    public int countWays(int n) {
        int count=0;
        int max25=n/25;//25面值硬币最多个数
        int ni,max10;
        for(int i=0;i<=max25;i++){
        	ni=n-i*25;
        	max10=ni/10;
        	for(int j=0;j<=max10;j++){
            	count+=((ni-j*10)/5+1);//满足条件的硬币个数(事实上是一个循环判断过程,但是为了降低循环量,故用一个等式表达)
            	count%=1000000007;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		Coins c=new Coins();
		System.out.println(c.countWays(2000));
	}
}
