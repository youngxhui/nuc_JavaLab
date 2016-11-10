package 第二十三周作业;

/**
 * Created by ASUS on 2016/11/10.
 */
public class Birthday{
    /**
     * 设i岁是开始举办生日party，举行了j个生日party。
     * 可列方程 (2*i + j - 1)*j/2 == 236
     * 穷举求解
     */
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= 100; j++){
                if((2*i + j - 1)*j/2 == 236){
                    System.out.println(i);  //26
                }
            }
        }
    }
}
