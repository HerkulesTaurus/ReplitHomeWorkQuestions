package Q6;

import java.util.Random;
import java.util.Scanner;

public class HesapMakinesi {
	​
	static Scanner scan = new Scanner(System.in);​

	public static void main(String[] args) {
		​
				int secim;
		​
				double sayi1, sayi2, sonuc;
				int faktoriyel;
		​
				do {
		​
					secim = menuDegerAl();
					switch (secim) {
					case 1:
						sayi1 = ondalikSayiAl();
						sayi2 = ondalikSayiAl();
						sonuc = toplama(sayi1, sayi2);
						sonucGoster(sonuc);
						break;
					case 2:
						sayi1 = ondalikSayiAl();
						sayi2 = ondalikSayiAl();
						sonuc = cikarma(sayi1, sayi2);
						sonucGoster(sonuc);
						break;
					case 3:
						sayi1 = ondalikSayiAl();
						sayi2 = ondalikSayiAl();
						sonuc = carpma(sayi1, sayi2);
						sonucGoster(sonuc);
						break;
					case 4:
						sayi1 = ondalikSayiAl();
						sayi2 = ondalikSayiAl();
						sonuc = bolme(sayi1, sayi2);
						sonucGoster(sonuc);
						break;
					case 5:
						faktoriyel = (int) tamsayiAl();
						sonuc = faktoriyelHesapla(faktoriyel);
						sonucGoster(sonuc);
						break;
					case 6:
						faktoriyel = (int) tamsayiAl();
					sonuc=rastgeleSayiUret(faktoriyel);
					sonucGoster(sonuc);	
						break;
						
					default:
					System.out.println("Hesap Mak KUllandiginiz icin Tesekkurler");	
					break;
					}
		​
				} while (secim != 7);
		         System.out.println("Cikis Yaptiniz");
			}

	public static void sonucGoster(double num) {
		System.out.println("isleminizin sonucu : " + num);
	}

	public static int rastgeleSayiUret(int num) {
		Random randomNum = new Random();
		return randomNum.nextInt() + 1;

	}

	public static int faktoriyelHesapla(int num) {
				int faktoriyel = 1;
				for (int i = 1; i <= num; i++) {
					faktoriyel *= i;
				}
				return faktoriyel;​
			}​

	private static double tamsayiAl() {
				Scanner scan = new Scanner(System.in);
				int sayi;
				System.out.println("Bir tam sayi giriniz ");
				sayi = scan.nextInt();
		​
				return sayi;
			}​

	private static double bolme(double sayi1, double sayi2) {
		​
				return sayi1 / sayi2;
			}​

	private static double carpma(double sayi1, double sayi2) {
		​
				return sayi1 * sayi2;
			}​

	private static double cikarma(double sayi1, double sayi2) {
		​
				return sayi1 - sayi2;
			}​

	private static double toplama(double num1, double num2) {
		​
				return num1 + num2;
			}​

	private static double ondalikSayiAl() {
		Scanner scan = new Scanner(System.in);
		double sayi;
		System.out.println("ondalik sayi giriniz : ");
		sayi = scan.nextInt();
		return sayi;
	}​

	private static void menuGoster() {
		System.out.println("1-Toplama\n2Cikarm\n3Carpma\n4Bolme\n5Faktoriyel\n6Rastgele Sayi\n7Cikis");

	}​

	public static int menuDegerAl() {
				Scanner scan = new Scanner(System.in);
				int sayi;
				menuGoster();
		​
				sayi = scan.nextInt();
				while (sayi < 1 || sayi > 7) {
					menuGoster();
					System.out.println("Lutfen menuden bir gecerli secim yapiniz");
					break;
				}
		​
				return sayi;

	}

}
