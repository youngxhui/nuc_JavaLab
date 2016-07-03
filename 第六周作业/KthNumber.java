import java.util.LinkedList;

/**
 * Created by 吴亚斌 on 2016/7/3.
 */
public class KthNumber {
    public int findKth(int k){
        int val=0;
        LinkedList<Integer> q3 = new LinkedList<>();
        LinkedList<Integer> q5 = new LinkedList<>();
        LinkedList<Integer> q7 = new LinkedList<>();
        q3.add(3);
        q5.add(5);
        q7.add(7);
        for(int j=1;j<=k;j++){
            int a=q3.peek(),b=q5.peek(),c=q7.peek();
            val=Math.min(Math.min(a,b),c);
            if(val==a){
                q3.add(val*3);
                q5.add(val*5);
                q3.removeFirst();
            }
            if (val==b){
                q5.add(val*5);
                q5.removeFirst();
            }
            if(val==c){
                q7.removeFirst();
            }
            q7.add(val*7);
        }
        return val;
    }

    public static void main(String[] args) {
        KthNumber k=new KthNumber();
       System.out.println( k.findKth(3));
    }
}