public class Max {

	static int max(int a,int b){
		
		return a*(b/a)+b*(a/b)+1;//这种方法必须要a,b不能为倍数
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++){
			if(max(i,i+1)<i||max(i+1,i)<i){
				System.out.println("错误");
			}
		}
	}

}
