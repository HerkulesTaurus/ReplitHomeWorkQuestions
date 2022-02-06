package Q6;

public class Atm {

	public static void main(String[] args) {

		static String kartNo = "1231231231231231";
		static String sifre = "12345";
		static int secim = 0;
		static Scanner scan = new Scanner(System.in);
		static double bakiye = 0;
		static String kullaniciSifre = null;
		static String yeniSifreTekrar = null;
		static String kartNoGiris = null;
	​
		public static void main(String[] args) {
			/*
			 * ATM Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi
			 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda boşluk ile
			 * girerse de eger doğruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
			 * kullanicinin yapabileceği işlemleri ekrana yazdirin,
			 * 
			 * Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve
			 * cikis.
			 * 
			 * Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
			 * Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli
			 * olmali, eger değilse menü ekranina geri donsun. Sifre değiştirme işleminde
			 * mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
			 */
	          
		
			
			do {
	          
				System.out.println("Kart Numarasi Giriniz");
				kartNoGiris = scan.nextLine();
				kartNoGiris = kartNoGiris.replace(" ", "");
	​
				System.out.println("Sifrenizi Giriniz");
				kullaniciSifre = scan.nextLine();
				kullaniciSifre = kullaniciSifre.replace(" ", "");
	​
				System.out.println("Agam benle eylenirmisin Dogru sifre ve kart no  gir ");
				System.out.println("Kart Numarasi Giriniz");
				kartNoGiris = scan.nextLine();
				System.out.println("Sifrenizi Giriniz");
				kullaniciSifre = scan.nextLine();
				
			} while (!kartNo.equals(kartNoGiris) || !sifre.equals(kullaniciSifre) || kartNoGiris.length() != 16);
			System.out.println("Dogru Giris Yaptin Agam");
			ekran();
	​
		}	
	​
		private static void ekran() {
	​
			System.out.println(
					"1->Bakiyeni Sorgula\n2->Para Yatrima\n3->Para Cekme\n4->Para Gonderme\n5->Sifre Degistir\n6->Cikis");
			secim = scan.nextInt();
			switch (secim) {
			case 1:
				bakiyeSorgulama();
				break;
			case 2:
				paraYatirma();
				break;
			case 3:
				paraCekme();
				break;
			case 4:
				paraGonderme();
				break;
			case 5:
				sifreDegistir();
				break;
			case 6:
				System.out.println("Cikis Yapildi TESEKKURLER");
				break;
			default:
				System.out.println("LUtfen Girisi 1,2,3,4,5,6");
			}
		}
	​
		private static void sifreDegistir() {
			// Sifre değiştirme işleminde
			// mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
			System.out.println("Mevcut Sifrenizi Giriniz");
	​
			kullaniciSifre = scan.next();
	​
			while (!sifre.equals(kullaniciSifre)) {
				System.out.println("Yanlis Sifre Girdiniz Tekrar Deneyiniz");
				sifreDegistir();
			}
			System.out.println("Sifre Dogru\nYeni Sifrenizi Giriniz");// yeni sifre 2 kere ayni girerse degistir
			String yeniSifre = scan.next();
			System.out.println("Yeni Sifreniz : " + yeniSifre + "\nYeni sifrenizi tekrar giriniz");
			yeniSifreTekrar = scan.next();
			if (yeniSifreTekrar.equals(yeniSifre)) {
				System.out.println("Sifreniz Guncellendi");
				System.out.println("Yeni Sifreniz: " + yeniSifre);
				yeniSifre = yeniSifre.substring(0, yeniSifre.length() - 2)
						+ yeniSifre.substring(yeniSifre.length() - 2).replaceAll("\\w", "*");
				System.out.println("Yeni Sifreniz : " + yeniSifre);
	​
			} else {
				System.out.println("Yeni sifrenizi yanlis girdiniz");
				ekran();
			}
	​
		}
	​
		private static void paraGonderme() {// Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli
			System.out.println("para gondermek istediginiz iban no giriniz");
			String iBan = scan.next().toUpperCase();
			while (!iBan.startsWith("TR") && iBan.length() != 26) {
				System.out.println("iban TR ile baslamali ve 26 karakter olmali..");
				ekran();
			}
			System.out.println("gonderilecek tutar");
			double gonderilecekTutar = scan.nextDouble();
			if (gonderilecekTutar <= bakiye) {
				bakiye -= gonderilecekTutar;
				System.out.println("guncel bakiyniz : " + bakiye);
			} else {
				System.out.println("yetersiz bakiye");
			}
		}
	​
		private static void paraCekme() {
	​
			System.out.println("Lutfen cekmek istediginiz tutari giriniz");
			double cekilecekTutar = scan.nextDouble();
			if (cekilecekTutar <= bakiye) {
				bakiye = bakiye - cekilecekTutar;
				System.out.println("Guncel bakiyeniz = " + bakiye);
			} else {
				System.out.println("Yetersiz bakiye. Lutfen bakiyenizdeki tutardan kucuk miktar giriniz");
			}
	​
		}
	​
		private static void paraYatirma() {
			System.out.println("Bakiyeniz = " + bakiye + "\nNe kadar para yatirmak istiyorsunuz?");
			double yatirilacakTutar = scan.nextDouble();
			bakiye += yatirilacakTutar;
			System.out.println("Guncel bakiyeniz =" + bakiye);
	​
		}
	​
		private static void bakiyeSorgulama() {
			System.out.println("bakiyeniz  :" + bakiye);
	​
		}
	}