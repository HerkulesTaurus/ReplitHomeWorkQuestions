package Q6;

import java.util.ArrayList;
import java.util.List;

public class YuzDenKucukAsalSayilar {

	public static void main(String[] args) {
		/*
		 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
		 */
		List<Integer> asal = new ArrayList<>();
		int sayac = 0;
		for (int sayi = 2; sayi <= 100; sayi++) {
			int kontrol = 0;
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					kontrol = 1;
					break;
				}
			}

			if (kontrol == 0) {

				asal.add(sayi);
				sayac++;
			}
		}

		System.out.print(asal + " ");
	}

}
