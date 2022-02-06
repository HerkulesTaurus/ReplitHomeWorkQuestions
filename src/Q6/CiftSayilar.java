package Q6;

import java.util.Scanner;

public class CiftSayilar {

	public static void main(String[] args) {
		/*
	    Veri tipi int olan bir sayi verildiginde
	​
	    0 dan baslayarak verilen sayiya kadar olan tum cift sayilari print edin.
	​
	    Example 1:
	    int input = 10;
	​
	    print  0 2 4 6 8 10  olmali
	​	​
	    Example 2:
	    int input = 15;
	​
	    print  0 2 4 6 8 10 12 14  olmali
	​
	     */
		 /* public static void main(String[] args) {	​
	        Scanner scanner = new Scanner(System.in);	​
	        int maxNum = scanner.nextInt();	​
	        // code Start here don't change before this line
	        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
	      */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int maxNum=scan.nextInt();
		for (int i = 0; i <maxNum; i+=2) {
			System.out.print(i+ " ");
	}
  }
}
