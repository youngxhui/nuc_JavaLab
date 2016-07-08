import java.util.*;
 
public class Transform
{
    public int calcCost(int A, int B)
    {
        int res=A^B;
        int count=0;
        while(res!=0)
        {
            count++;
            res&=res-1;
             
        }
        return count ;
       
    }
}