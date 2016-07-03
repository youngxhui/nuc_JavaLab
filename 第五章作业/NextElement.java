import java.util.*;
 
public class NextElement {
    public int[] findNext(int[] A, int n) {
        // write code here
        int[] ret = new int[n];
        ret[n-1] = -1;
        int count = 0;
         
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]<A[j]){
                    ret[i] = A[j];
                    break;
                }
                else{
                    count++;
                }
            }
             
            if(count ==(n-1-i)){
                ret[i] = -1;
            }
            count = 0;
        }
         
        return ret;
    }
}