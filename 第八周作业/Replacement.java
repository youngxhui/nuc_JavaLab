package 第八周;

/**
 * Created by 吴亚斌 on 2016/7/15.
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer s=new StringBuffer();
        for(int i=0;i<length;i++){
            char a=iniString.charAt(i);
            if (a==' '){
                s.append("%20");
            }
            else{
                s.append(a);
            }
        }
        return s.toString();
    }
}
