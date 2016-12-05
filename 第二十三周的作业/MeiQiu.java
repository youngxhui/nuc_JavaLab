class MeiQiu{
	public static void main(String[] args) {

				int a = 2,n=1,allnum=1;
				for(int i = 2;i<=100;i++)
				{
					n =n+a;
					a++;
	                allnum =allnum+n;
				}
				System.out.println("100²ãµÄÃºÇòÎª£º"+allnum);
		}
}