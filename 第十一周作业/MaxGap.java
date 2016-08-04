import java.util.*;
 
public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            max = max<A[i]?A[i]:max;
        }
        return Math.max(Math.abs(max-A[0]),Math.abs(max-A[A.length-1]));
    }
}