package 第七周作业;

/**
 * Created by 吴亚斌 on 2016/7/3.
 */
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
      AB[1]=AB[1]^AB[0];
      AB[0]=AB[0]^AB[1];
      AB[1]=AB[0]^AB[1];
        return AB;

    }
}


