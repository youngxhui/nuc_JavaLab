/**
 * Created by 晓辉 on 2016/7/8.
 */
import java.util.*;

public class Transform {
    public int calcCost(int A, int B) {
        // write code here

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

