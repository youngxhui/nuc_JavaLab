package 第七周作业;

/**
 * Created by 吴亚斌 on 2016/7/3.
 */
public class TransForm {
    public int calcCost(int a, int b) {
        // write code here
        int res=a^b;
        int num=0;
        while(res!=0){
            if((res&1)==0){
                num++;
                res>>=1;
            }
        }
      return num;
    }
}
