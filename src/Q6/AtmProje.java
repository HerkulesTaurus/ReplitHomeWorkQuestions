package Q6;

import java.util.Scanner;

public class AtmProje {
	static String kartNumaram = "123456";
	static String sifrem = "1234";
	static double bakiye ;

	public static void main(String[] args) {
		/*
		 * Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi
		 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda boşluk ile
		 * girerse de eger doğruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
		 * kullanicinin yapabileceği işlemleri ekrana yazdirin, Bakiye sorgula, para
		 * yatirma, para çekme, para gönderme, sifre değiştirme ve cikis. Para çekme ve
		 * para gonderme işleminde mevcut bakiyeden buyuk para çekilemez, Para gönderme
		 * işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger
		 * değilse menü ekranina geri donsun. Sifre değiştirme işleminde mevcut şifreyi
		 * teyit ettikten sonra, sifre değişiklik işlemini yapmali,
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("JAVA BANKA HOSGELDİNİZ");

		String kart = "";
		String sifre = "";

		do {
			System.out.println("Kart numaranızı gırınız ");
			kart = scan.nextLine();
			System.out.println("lutfen sıfrenızı gırınız ");
			sifre = scan.next();
			if (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram)) {

				System.out.println("hatali giris yaptınız");
			}

		} while (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram));

		ekran();

	}

	private static void ekran() {

		Scanner scan = new Scanner(System.in);

		System.out.println("sifreniz dogrulandı");

		char secim = ' ';
		do {
			System.out.println("Lutfen yapmak ıstedıgınız ıslemı gırınız\nA->Bakiye sorgulama\nB->Para cekme\n"
					+ "C->Para yatırma\nD->Para gonderme\nE->Sifre degistirme\nF->Cikis");

			secim = scan.next().toUpperCase().charAt(0);

			switch (secim) {
			case 'A':
				bakiyeSorgulama();
				break;
			case 'B':
				paraCekme();
				break;
			case 'C':
				paraYatirma();
				break;
			case 'D':
				paraGonderme();
				break;
			case 'E':
				sifreDegistirme();
				break;
			case 'F':
				System.out.println("Cikis basarili :");
				break;

			default:
				System.out.println("Lutfen gecerli bir islem seciniz.");
				break;
			}

		} while (secim != 'F');

	}

	private static void bakiyeSorgulama() {
		System.out.println("Bakiyeniz->" + bakiye + "tl");
	}

	private static void paraCekme() {

		Scanner scan = new Scanner(System.in);
		double cekilenTutar;
		System.out.println("Cekmek istediginiz tutari giriniz.");
		cekilenTutar = scan.nextDouble();

		if (cekilenTutar <= bakiye) {

			bakiye -= cekilenTutar;
			System.out.println("İslem basarili.\n Mevcut bakiyeniz:" + bakiye);

		} else {
			System.out.println("Bakiye yetersiz");
		}
	}

	private static void paraYatirma() {
		Scanner scan = new Scanner(System.in);
		double yatirilanTutar;

		System.out.println("Yatirmak istediginiz tutari giriniz.");

		yatirilanTutar = scan.nextDouble();

		bakiye = yatirilanTutar;
		System.out.println("Islem basarili paraniz hesabınıza yatırıldı.\nMevcut bakiyeniz :" + bakiye);

	}

	private static void paraGonderme() {

		Scanner scan = new Scanner(System.in);
		String Iban;
		double gonderilecekTutar;

		System.out.println("Lutfen para gondereceginiz IBAN numarasini giriniz.");// ıban TR ıle baslayacak ve 26
																					// karakterli olacak

		Iban = scan.nextLine().toUpperCase(); // tr TR tR Tr = TR

		if (Iban.startsWith("TR") && Iban.replaceAll("\\s", "").length() == 26) {

			System.out.println("Gonderilecek tutari giriniz");

			gonderilecekTutar = scan.nextDouble();

			if (gonderilecekTutar <= bakiye) {

				bakiye -= gonderilecekTutar;
				System.out.println("Paraniz gonderildi\nMevcut bakiyeniz:" + bakiye);

			} else {
				System.out.println("Bakiyeniz yetersiz");

			}

		} else {
			System.out.println("Gecersiz IBAN girdiniz");
		}

	}

	private static void sifreDegistirme() {

		Scanner scan = new Scanner(System.in);

		String mevcutSifre;
		
		System.out.println("Mevcut sifrenizi giriniz");
		
		mevcutSifre=scan.next();
		
		if (mevcutSifre.equals(sifrem)) {
			
			System.out.println("Yeni sifrenizi giriniz");
			sifrem=scan.next();
			System.out.println("Sifrenizi degistirildi");

		} else {
			
			System.out.println("Sifreler uyusmuyor");

		}
		
	}

}