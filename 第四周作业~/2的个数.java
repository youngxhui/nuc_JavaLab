import java.util.*;

public class Count2 {

	public int countN(int n) {
		int count = 0;
		for (int j = 0; j <= n; j++) {
			int i;
			String s = String.valueOf(j);
			i = s.length() - 1;
			for (; i >= 0; i--) {
				char c = s.charAt(i);
				if (c == '2') {
					count++;
				}
			}
		}
		return count;
	}

}
