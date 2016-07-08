import java.util.*;
 
public class Exchange {
    public int[] exchangeAB(int[] AB) {
         
        AB[0] = AB[0] ^ AB[1];
         
        AB[1] = AB[0] ^ AB[1];
         
        AB[0] = AB[0] ^ AB[1];
         
        return AB;
    }
}