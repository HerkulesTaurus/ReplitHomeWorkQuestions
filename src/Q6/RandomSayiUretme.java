package Q6;
import java.util.Scanner;
public class RandomSayiUretme {

	public static void main(String[] args) {
	/*
   Given a positive integer num name is max ,
   create a random number between 0 to max
   output should be int
		  
   Veri tipi integer olan max sayısı verildiğinde
   0 ile max sayisi arasindan random bir sayi elde et(olustur)
   output tipi int olmalı random() metodunun kullanımı. 		  
    */	    
		Scanner scan=new Scanner(System.in);
		    
		System.out.println("Lutfen bir sayi giriniz");
		    
		int max=scan.nextInt();
		       
		int iSayi = (int)(Math.random()*max); 
		    // Math.random 0 ile 1 arasında double sayı üretiyor, biz burada kullanıcının verdiği sayı ile çarpınca 
		    // ve (int) ifadesi ile casting yapınca
		    //0 ile kullanıcının verdiği sayı arasında rastgele integer sayı üretiyor
		    
		System.out.println("Rastgele çekilen int    sayı  : " + iSayi);
		    
		}
		}
	


