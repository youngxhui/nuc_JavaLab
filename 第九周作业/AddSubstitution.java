package nineWeek;

/**
 * Created by 吴亚斌 on 2016/7/31.
 */
public class AddSubstitution {
    public  int  calc(int a,int b,int type){
        if(type==1)
            return a*b;
        else if (type==-1)
            return a-b;
        else if (type==0)
            return a/b;
        return 0;
    }
}
