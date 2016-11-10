package Lab;

/**
 * Created by Wean on 2016/11/10.
 */
public class Birthday {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            int k=i;
            for (int j = i+1;; j++) {
                k+=j;
                if (k==236){
                    System.out.println(i);
                    return;
                }
                if (k>236){
                    break;
                }
            }
        }
    }
}
