package tenWeek;

/**
 * Created by 吴亚斌 on 2016/8/4.
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

 */
public class Solution2 {
    public int Sum_Solution(int n) {
        int a = n;
        boolean flag = (n>0)&&((a+=Sum_Solution(n-1))>0);
        return a ;
    }
}
