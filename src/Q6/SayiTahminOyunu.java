package Q6;

import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
Random   rnd = new Random();

System.out.println("Sayi tahmin oyununa hosgeldınız...");
System.out.println("Lutfen 1-100 arasında bır sayı giriniz:");
// kullanıcı sayı alıyoruz 

int tahmin = scan.nextInt();
//bilgisayardan rastgele sayi alıyoruz 

int sayi =rnd.nextInt(101);
while (tahmin != sayi) {
	if (tahmin < 0 || tahmin > 100) {
		System.out.println("1 ile 100 arasında bir deger giriniz:");
		tahmin = scan.nextInt();
		}
	else if (tahmin<sayi) {
		System.out.println("daha buyuk bır sayı gırınız:");
		tahmin = scan.nextInt();
	
	}else {
	System.out.println("Daha kucuk bır sayı gırınız:");
	tahmin=scan.nextInt();
	}
}
// eger sayımız ve tahmın bırbırıne esitse while dongusune gırmez
// ve print komuutu yazdırınız 
System.out.println("Tebrikler, kazandınız!");
	
	}	
}


