package elevenWeek;

/**
 * Created by 吴亚斌 on 2016/8/4.
 * 小东和三个朋友一起在楼上抛小球，他们站在楼房的不同层，假设小东站的楼层距离地面N米，球从他手里自由落下，每次落地后反跳回上次下落高度的一半，并以此类推知道全部落到地面不跳，求4个小球一共经过了多少米？(数字都为整数)
 给定四个整数A,B,C,D，请返回所求结果

 # 测试样例：
 >100，90，80，70

 >返回：1020
 */
public class MaxGap2 {
    public int BallWay(int a,int b,int c,int d){
        int sum=0;
        for(int i=0;a<1&&b<1&&c<1&&d<1;){
            sum=sum+a+b+c+d;
            a=a/2;
            b=b/2;
            c=c/2;
            d=d/2;
        }
        return sum;
    }
}
