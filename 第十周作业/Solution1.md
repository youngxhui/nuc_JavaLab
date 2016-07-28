`#include<stdio.h>
int Sum_Solution(int n)
{
	int temp=0;
	n&&(temp=Sum_Solution(n-1));
	return temp+n;
}
int main()
{
	printf("%d",Sum_Solution(2));
}`