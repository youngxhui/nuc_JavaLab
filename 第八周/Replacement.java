import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        char[] a=new char[length];
        a=iniString.toCharArray();
        StringBuffer sb = new StringBuffer();
         sb. append(a[0]);
        String b=sb.toString();
        String m="%20";
        for(int i=1;i<length;i++){
            if(a[i]==' '){
                b+=m;
            }else{
              b+=a[i];  
            }
            
        }
       
        return b;
    }
}