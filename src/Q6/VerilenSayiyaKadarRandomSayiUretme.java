package Q6;

import java.util.Scanner;

public class VerilenSayiyaKadarRandomSayiUretme {

	public static void main(String[] args) {
		// girilen sayiya kadar random sayi uret

		Scanner scan = new Scanner(System.in);
		System.out.println("sayi gir");
		int number = scan.nextInt();

		Random random = new Random();
		int uretilenSayi = 0;
		uretilenSayi = random.nextInt(number);

		System.out.println(uretilenSayi);
	}

}
