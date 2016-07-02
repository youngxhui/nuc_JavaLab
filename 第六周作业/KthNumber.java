/**
 * Created by 晓辉 on 2016/6/23.
 */
public class KthNumber {
    public int findKth(int k) {
        // write code here
        int []array=new int[101];
        array[0]=0;
        array[1]=3;
        array[2]=5;
        array[3]=7;
        if(k<=3){
            return array[k];
        }
        int index3=1,index5=1,index7=1;
        int i=4;
        while(i<=k){
            while(array[index3]*3<=array[i-1]){
                index3++;
            }
            while(array[index5]*5<=array[i-1]){
                index5++;
            }
            while(array[index7]*7<=array[i-1]){
                index7++;
            }
            array[i++]=min(array[index3]*3,array[index5]*5,array[index7]*7);
        }
        return array[k];
    }
    int min(int a,int b,int c){
        return (a<b?(a<c?a:c):(b<c?b:c));
    }
}
