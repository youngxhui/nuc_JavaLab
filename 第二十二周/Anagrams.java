package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Wean on 2016/11/10.
 */
public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strT1 = br.readLine();
        String strT2 = br.readLine();

        char[] c1 = strT1.toCharArray();
        char[] c2 = strT2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String t1 = new String(c1);
        String t2 = new String(c2);
        String strRtn = "N";
        if (t1.equals(t2)) {
            strRtn = "Y";
        }

        System.out.println(strRtn);
    }
}
