/**
 * Created by 晓辉 on 2016/6/9.
 */
public class 词频统计 {
    public static void main(String[] args) {
      String[] article=new String[1000];
      article= new String[]{"i","can","can"};
        String word="c";

        System.out.println(getFrequency(article,0,word));
    }
    public static int getFrequency(String[] article, int n, String word) {
        // write code here
        int count = 0;
        int a = word.length();
        for (int i = 0, len = article.length; i < len; i++) {
            for (int j = 0; j < a; j++) {
                if (article[i + j].equals(word)) {


                    count++;
                }

            }

        }
        return count;
    }
}


