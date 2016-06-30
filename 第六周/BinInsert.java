import java.util.*;
 
public class BinInsert
{
    public int binInsert(int n, int m, int j, int i)
    {
        m<<=j;
        return m|n;
    }
}