/**
 * Created by 吴亚斌 on 2016/7/3.
 */
public class BinInsert {
    public int binInsert(int n, int m, int j, int i) {
        m <<= j;
        return n | m;
    }
}
