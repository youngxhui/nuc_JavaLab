package 实验室每周一练;

public class TestMax {
	public int getMax(int a,int b){
		int c = (a-b)>>31;
	    return a+c*(a-b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMax tm=new TestMax();
		System.out.println(tm.getMax(6, 2));
	}

}
