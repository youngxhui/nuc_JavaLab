package nineWeek;

/**
 * Created by 吴亚斌 on 2016/7/31.
 */
public class CrossLine {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        boolean re=false;
        if(s1==s2&&y1==y2){
            re=true;
        }
        else if (s1!=s2){
            re=true;
        }
        return re;
    }
}
