public class Exchange {

	public int[] exchangeAB(int[] AB) {
        // write code here
		AB[1]=AB[1]+AB[0];
		AB[0]=AB[1]-AB[0];
		AB[1]=AB[1]-AB[0];
		return AB;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchange e=new Exchange();
		int[] s={1,2,3};
		int[] t=e.exchangeAB(s);
		for(int i : t){
			System.out.println(i);
		}
	}
}
