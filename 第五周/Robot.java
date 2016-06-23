import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if(x+y>12)
            return 0;
        else if(x<=1 && y<=1)  
            return 0;  
        else if(x == 1 || y == 1)  
            return 1;  
        else  
            return countWays(x-1,y)+countWays(x,y-1);  
        
    }
}