package Q6;

public class NeKadarToplam {

	public static void main(String[] args) {
		int ustLimit = 5;
		// [5 ~ 10]

		System.out.println(topla(ustLimit));

	}

	private static int topla(int a) {
		if (a < 0) { return 0;}
		
		
		return a + topla(a - 1);
	}

}
