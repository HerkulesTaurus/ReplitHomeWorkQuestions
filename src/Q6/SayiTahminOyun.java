package Q6;

import java.util.Scanner;

public class SayiTahminOyun {

	public static void main(String[] args) {
	
		// kullanıcıdan 5 defada tahmın edebılecegı sayı ısteyın 
		Scanner tahmin=new Scanner(System.in);
		
		int hak=5;
		int sayi=0;
		int girilenSayi;
		Random rnd = new Random();
		sayi = rnd.nextInt(100); // 0 la 100 arasında sayi
		
		do {// do tahmın hakkı bıtene kadar dongu calısacak 
			System.out.println("Tahmininizi giriniz...");
			girilenSayi=tahmin.nextInt();
		if (sayi==girilenSayi) { //girilen sayi ile random sayımız aynı mı dıye 
		System.out.println("Bildin...Tebrikler");
		break;//eger bildiyse dongu kırılıp cıkacak 
		}
		else {
			if(hak==1) {//eger kısı bılemedıyse ve son hakkı kaybettın dıyerek 
				System.out.println("Kaybettin.");
				System.out.println("Tutulan sayi...:"+sayi);
				break;
			}
			System.out.println("Yanlıs tahmın kalan hak "+ --hak);// her yanlıs cevapta ve kalan tahmın sayısı 
		}
			
		}while(hak>0);
			
		}
		
		
		
		
		
		
	}


