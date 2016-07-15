/**
 * Created by 晓辉 on 2016/7/15.
 */
public class Replacement {

    // write code here
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder sb = new StringBuilder();
        String strReplace = "%20";
        for (int i = 0; i < length; i++) {
            char tmp = iniString.charAt(i);
            if (tmp == ' ') {
                sb.append(strReplace);
            } else {
                sb.append(tmp);
            }
        }
        return sb.toString();

    }
}
