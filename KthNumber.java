public class KthNumber {

    public int findKth(int k) {
        // write code here
    	int c=0;
    	for(int i=3;c<=100;i++){
    		int s=i;
		while(s%3==0)s/=3;
		while(s%5==0)s/=5;
		while(s%7==0)s/=7;
		if(s==1){
			c++;
			if(c==k)return i;
		}
    	}
    	return -1;
    }
    public static void main(String[] args) {
	KthNumber k=new KthNumber();
	System.out.println(k.findKth(100));
    }
}
