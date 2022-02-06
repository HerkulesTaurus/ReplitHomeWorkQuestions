package Q6;

import java.util.Iterator;
import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		// mukemmel sayi: kendisi haric pozitif tam bölenlerin toplamı  
		// kendısıne eşit olan sayıdir
		
		Scanner scan = new Scanner(System.in);
		int toplam =0;
		
		System.out.println("Bir sayi giriniz:");
		int sayi = scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		
		if(sayi == toplam) {
			System.out.println(sayi + "  Mukemmel bir sayidir");
		}
		
		else {
			System.out.println(sayi + "  Mukemmel bir sayi degildir");
		}
		
		
		
		
	}

}
