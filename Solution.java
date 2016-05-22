package task1;

public class Solution {
	int fi=0;
	public int fibonacci(int n){
		if(n==1){
			fi=0;
		}
		else if(n==2){
			fi=1;
		}
		else if(n>=3){
			fi=(fibonacci(n-1)+fibonacci(n-2));
		}
		
		
		return fi;
	}
}
