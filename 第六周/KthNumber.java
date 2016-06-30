import java.util.*;
 
public class KthNumber {
    public int findKth(int k) {
        // write code here
        int[] result=new int[k];
        if (k==0)
            return 1;
        else if(k==1)
            return 3;
        else if(k==2)
            return 5;
        else if(k==3)
            return 7;
        else{
             int i=0;
             int j=1;
             int t=2;
             result[0]=3;
             result[1]=5;
             result[2]=7;
             
            for(int count=3;count<k;count++){
                if(3*result[i]<=5*result[j]&&3*result[i]<=7*result[t]){
                      if(3*result[i]==result[count-1]){
                          count--;
                          i++;
                      }
                      else{
                          result[count]=3*result[i];
                            i++;
                      }
                     
                }else if(5*result[j]<=3*result[i]&&5*result[j]<=7*result[t]){
                       if(5*result[j]==result[count-1]){
                           count--;
                          j++;
                       }else{
                           result[count]=5*result[j];
                            j++;
                       }
                     
                }else {
                    if(7*result[t]==result[count-1]){
                        count--;
                      t++;
                    }else{
                        result[count]=7*result[t];
                        t++;
                    }
                     
                }  
                 
            }
             return result[k-1];
        }
  }
}
