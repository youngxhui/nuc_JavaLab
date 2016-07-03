//1,5,20,25;
public class Coins {
	int CountWays(int n,int coin)  
	{  
	    int next=0;  
	    switch(coin)  
	    {  
	    case 25:  
	        next=10;  
	        break;  
	    case 10:  
	        next=5;  
	        break;  
	    case 5:  
	        next=1;  
	        break;  
	    case 1:  
	        return 1;  
	    }  
	  
	    int count=0;  
	    for(int i=0;i*coin<=n;i++)  
	        count+=CountWays(n-i*coin,next);  
	  
	    return count;  
	  
	}  
}
