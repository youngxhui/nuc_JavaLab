public class NextElement {

	public int[] findNext(int[] A, int n) {
        int[] B=new int[n];
		for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if(A[j]>A[i]){
        			B[i]=A[j];
        			break;
        		}else if(j==n-1){
        			B[i]=-1;
        		}
        	}
        }
		B[n-1]=-1;
		return B;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextElement n=new NextElement();
		int[] a={11,13,10,5,12,21,3};
		int[] b=n.findNext(a, 7);
		for (int i : b){
			System.out.println(i);
		}

	}

}
