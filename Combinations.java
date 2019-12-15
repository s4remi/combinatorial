
public class Combinations {

	int combinations(int n, int r) {
		if (n == 0 || r >= n || r == 0) {
			return 1;
		}
		return combinations(n - 1, r) + combinations(n - 1, r - 1);
	}

	public static void main(String[] args) {
		Combinations test = new Combinations();
		System.out.println(test.combinations(4, 3));
	}

}
