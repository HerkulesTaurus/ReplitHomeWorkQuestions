package Q6;

import java.util.Scanner;

public class SayilardaTamKare {

	public static void main(String[] args) {
		
		/*
	    Pozitif bir int  num verildiginde, return edildigi zaman num tam kare ise true veren degilse false veren bir foksiyon yazin.
​
	   Not: sort gibi fonksiyonlari  kullanmayin.
​
	        Example 1:
	        Input: 16
	        Output: true
	        Not: bu sayi tamkare  4*4 = 16
​
	        Example 2:
	        Input: 25
	        Output: true
	        Note: bu sayi tamkare   5*5=25	        
	//Tam kare karekökü bir doğal sayı olan tam sayılara denir. Diğer bir deyişle, kendiyle çarpılan (karesi alınan) doğal sayıların sonucu tam karedir.
	 *  0, 1, 4, 9, 16, 25, 36, 49... ilk tam karelere örnektir.
​
	        Example 3:
	        Input: 14*/
		 
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("bir tam sayi giriniz : ");
	      int input = scanner.nextInt();

	       
	      // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
	      
	      boolean sonuc=false;
	      
	      for (int i = 0; i <=input/2+1;i++) {
	    	  if (input==i*i) {
	    		  sonuc=true;
	    		  break;
			} else {
				sonuc=false;
			}
			
		}
	       System.out.println(sonuc);
	}

}
