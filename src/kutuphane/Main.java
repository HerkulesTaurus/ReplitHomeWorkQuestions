package kutuphane;

import java.util.Scanner;

public class Main {

	static Kitapİslemleri kitapislemleri = new Kitapİslemleri();

	public static void main(String[] args) {

		// Kitap ekle
		// Kitap sil
		// Kitap bul
		// Tum kitapları goster
		// Cıkıs yap

		acilisMenusu();

	}

	private static void acilisMenusu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("kutuphaneye hosgeldınız ");
		System.out.println("Yapmak istediginiz islemi seciniz ");
		System.out.println("1- Kitap ekle ");
		System.out.println("2- Kitap sil ");
		System.out.println("3- Kitap bul ");
		System.out.println("4- Tum kitapları goster");
		System.out.println("5- Cıkıs yap");

		int tercih = scanner.nextInt();

		switch (tercih) {
		case 1:
			System.out.println("kıtabın ısmını gırınız ");
			String kitapAdi = scanner.nextLine();
			System.out.println("Kıtap ısbnNo giriniz");
			String kitapIsbn = scanner.nextLine();
			System.out.println("kitap acıklaması gırnız");
			String aciklama= scanner.nextLine();
			
			//yazarbilgileri
			System.out.println("yazar ismini giriniz");
			String yazarAdi=scanner.nextLine();
			System.out.println("yazar yasını gırınız");
			int yas=scanner.nextInt();
			scanner.nextLine();
			System.out.println("yazarın memleketını gırınız");
			String yazarMemleketi=scanner.nextLine();
			Yazar yazar=new Yazar(yazarAdi,yas,yazarMemleketi);
			
			//yayınevı bilgileri
			System.out.println("yayınevı ismini giriniz");
			String yayineviAdi=scanner.nextLine();
			System.out.println("Yayinevi adresini giriniz");
			String yayineviAdresi=scanner.nextLine();
			Yayinevi yayinevi=new Yayinevi(yayineviAdi,yayineviAdresi);
			
			Kitap ktp = new Kitap(kitapAdi,kitapIsbn,aciklama,yazar,yayinevi); // alınan bılgılerı toplamak ısın olusturduk
			
			//Kitapİslemleri.kitaplar.add(ktp); boyle de yapılabılırdı
			kitapislemleri.kitapEkle(ktp); 
			System.out.println("kıtap kaydedıldı");
			
			acilisMenusu();
			
			break;
		case 2:
			System.out.println("silmek istediginiz kitabın isbn nosunu gir");
			String isbn = scanner.nextLine();
			kitapislemleri.kitapSil((isbn);
			break;
		
		case 3:
			System.out.println("Aradıgınız kitabin ismini yazınız");
			String arananKitap = scanner.nextLine();
			kitapislemler.kitapBul(arananKitap);
			break;
		case 4:
			tumKitaplariGoster();
		break;
		case 5:
			System.out.println("bol okumalar");
			System.exit(0);
			break;

		default:
			System.out.println();
			break;
		}

	}

}
