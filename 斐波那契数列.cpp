#include<iostream>
using namespace std;
//为了提高程序效率将不使用递归处理 
long fib(int k)
{
	int i=0,j=1;
	while(--k)
	{
		int h=i;
		i=j;
		j=h+j;
	}
	return i;
}
int main()
{
	for(int i=1;i<=10;i++)
	{
		cout<<fib(i)<<endl;
	}
	return 0;
}
