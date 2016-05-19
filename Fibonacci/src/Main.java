import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner reader = new Scanner(System.in);
			int n = reader.nextInt();
			System.out.println(fibonacci(n));
		}

	}

	public static int fibonacci(int a) {
		if (a < 3) {
			return a - 1;
		} else {
			return fibonacci(a - 1) + fibonacci(a - 2);
		}

	}
}
