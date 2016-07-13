public class Transform {

	public int calcCost(int A, int B) {
        // write code here
		int len=50;
		int[] sa=new int[len],sb=new int[len];
		len=0;
		while(A!=0||B!=0){
			sa[len]=A%2;
			sb[len++]=B%2;
			A/=2;
			B/=2;
		}
		int count=0;
		for(int i=0;i<len;i++){
			if(sa[i]!=sb[i])count++;
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transform t=new Transform();
		System.out.println(t.calcCost(10, 5));
	}

}
