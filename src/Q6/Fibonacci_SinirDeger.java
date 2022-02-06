package Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci_SinirDeger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen fibonaccisine kadar gidilmek uzere sinir degeri giriniz : ");

		if (scan.hasNextInt()) {
			int sinir = scan.nextInt();

			List<Integer> fibonacci = new ArrayList<>();

			fibonacci.add(1);
			fibonacci.add(1);

			int sayi = 0;

			while (sayi < sinir) {
				sayi = fibonacci.get(fibonacci.size() - 2) + fibonacci.get(fibonacci.size() - 1);
				fibonacci.add(sayi);

			}

			System.out.println(fibonacci);

			fibonacci.remove(fibonacci.size() - 1);
			System.out.println(fibonacci);

		} else {
			System.out.println("Hatali giris");
		}
	}
}