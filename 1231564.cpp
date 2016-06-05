#include <iostream>
#include <cstdio>
using namespace std;
	 int a[3][3] =  { { 1, 0, 1 }, { 1, -1, -1 }, { 1, -1, 0 } };
	 int count;
	 int c[3][3]={0};
	 int fun(int b, int c) {
		if(b<0||b>3||c<0||c>3){
			return false;
		}
		if (a[b][c] == 1&&c[a][b]==0) {
			c[a][b]=1; 
			count++;
			if (count == 3) {
				return true;
			}

			fun(b, c + 1);
			fun(b - 1, c);
			fun(b + 1, c);
			fun(b, c - 1);
			fun(b - 1, c - 1);
			fun(b - 1, c + 1);
			fun(b + 1, c + 1);
			fun(b + 1, c - 1);
			
		}
		c[a][b]=1;

	}

	 int main() {
	
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				count = 0;
				if (fun(i, j)) {
					printf("true");
					flag = 1;
				}
				if (flag == 1)
					break;
			}
			if (flag == 1)
				break;
		}
		if (flag == 0) {
			printf("flase");
		}

	}
