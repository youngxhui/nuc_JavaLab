public class Count2 {
	public int countNumberOf2s(int n) {//非常低效的算法!不具有参考价值
		int count=0;
		for(int i=2;i<=n;i++){
			int k=i;
			while(k!=0){
				if(k%10==2){
					count++;
				}
				k/=10;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Count2 c=new Count2();
		System.out.println(c.countNumberOf2s(200));
		
	}

}
