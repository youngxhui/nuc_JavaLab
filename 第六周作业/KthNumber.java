import java.util.*;

public class KthNumber {
	public int findKth(int k) {
		boolean t = false;
		List number = new ArrayList();
		for (int i = 1; i <= 100; i++) {
			List yu = new ArrayList();

			for (int j = i; j > 1; j--) {

				if (i % j == 0)
					yu.add(j);

			}
			Iterator it = yu.iterator();
			while (it.hasNext()) {
				int a = (int) it.next();
				if (a != 3 && a != 5 && a != 7) {

					t = false;
					break;
				} else {
					t = true;
				}

			}
			if (t == true) {

				number.add(i);

			}

		}

		return (int) number.get(k - 1);
	}
}
