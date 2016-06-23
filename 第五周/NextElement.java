import java.util.*;

public class NextElement {
    public int[] findNext(int[] A, int n) {
        // write code here
        int j;
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(A[i]<A[j]){
                    A[i]=A[j];
                    break;
                }
            }
            if(j==n){
                    A[i]=-1;
                }
        }
        return A;
    }
}