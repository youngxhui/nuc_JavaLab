/*
测试数据:
12 34
90 2
-12 45
56 78
结果:
46
92
33
134 
*/
#include<iostream>
using namespace std;
int add(int x,int y){
	int a=x&y;//机器码相与,相当于进位(x与y相应机器码位都为1时x&y=1否则x&y=0) 
	int b=x^y;//机器码相异运算,相当于没有进位的加法运算(x与y的机器码分别为0,1或1,0时x^y=1,否则x^y=0) 
	while(a){//进位不为0时,执行加法与进位操作 
		int tx=b;//当前的未完成进位的数 
		int ty=a<<1;//进位左移一位 
		a=tx&ty;//下一次的进位数 
		b=tx^ty;//执行进一位的加法操作 
	}
	return b;
}
int main(){
	int x,y;
	while(cin>>x>>y){
		cout<<add(x,y)<<endl;
	}
	return 0;
}
