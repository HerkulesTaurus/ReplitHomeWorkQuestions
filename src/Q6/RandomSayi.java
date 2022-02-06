package Q6;

import java.util.Scanner;

public class RandomSayi {

	public static void main(String[] args) {
		 /*
	    Veri tipi integer olan max sayisi verildiginde
	    0 ile max sayisi arasindan random bir sayi elde et(olustur)
	    output tipi int olmali
	  */
			Scanner scanner = new Scanner(System.in);
	        System.out.print("bir sayi giriniz : ");
	        int max=scanner.nextInt();
	               
	        // Java'da rastgele bir sayı çekmek için kullanılan sınıf olan Random sınıfı kullanılır. 
	        // random sınıfını kullanabilmemiz için java.util paketini projemize dahil etmeliyiz
	        
	        // Java'da bir random oluşturmak için ya bir maksimum değer belirlemelisiniz ya da hiçbir değer vermeden rastgele bir sayı çekmesini söylemelisiniz. 
	        // Şu şekilde rastgele bir sayı çekebilirsiniz;
	        Random rastgele  = new Random();
	        int rastgeleSayi = rastgele.nextInt(max); // 0-max arası sayıları çeker.
	        										  // buradaki max yerine yazacağımız sayı ile 0 arasında rasgele sayı çekilir. 
	        System.out.println("int maximum değere kadar rastgele bir sayı: " + rastgeleSayi);
	        
	        // Eğer rastgele sayı alırken 0'dan değilde 1'den başlamasını ve 100 sayısının da dahil edilmesini istiyorsak;
	        
	        rastgeleSayi = rastgele.nextInt(100)+1;
	        System.out.println("1 ile 100 arasında rastgele bir sayı " + rastgeleSayi);
	        
	        //Eğer belli bir aralıktaki sayıları bulmak istiyorsak şöyle bir formül oluşturabiliriz;	
	        //maximumsayi - minimumsayi +1
	        //10 ile 100 arasında rastgele sayı (10 ve 100 dahil) almak istiyoruz: 100-10+1 = 91
	        
	        rastgeleSayi = rastgele.nextInt(100) + 10;
	        System.out.println("10 ile 100 arasındaki rastgele bir sayı "+ rastgeleSayi);       
}
}


