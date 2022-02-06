package Q6;

import java.util.Scanner;

public class OdevSoru1 {
	/*  Kullanici tarafindan girilen inputda kac tane 'b' karakteri oldugunu belirle ve print et.
	​
	     input : Test output
	         b : 0
	      output 0 olmali 
	​	​
	     input : bucket
	         b : 1
	      output 1 olmali	​​
	//hint: .charAt, length(), for, index, counter 
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String   text = input.nextLine();
	// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter text to find the number 'b' in the text:");
		String input=scan.nextLine();
		countLettersb(input, 'b'); // System.out.println(countLettersb(input,'b'));
		System.out.println("Input contains "+(countLettersb(input, 'b'))+ " 'b' letters");
	}
	public static int countLettersb(String text, char letter) {
		int piece = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter)
				piece++;
		}
		return piece;
	}

}
			/* ******diger cozum****** */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Please enter text to find the number 'b' :");

		String   text = input.nextLine();
		
		
		char karakter ='b';
		
		int adet =0;
		
		for (int i = 0; i < text.length(); i++) {
			
			if (karakter== text.charAt(i)) {
				
				++adet;
			}
		}
		System.out.println("yazi icinde 'b' " + adet + " tanedir");
			
			
		}
	}			/* ******diger cozum****** */

static void harfBul(String sentence, char letter) {
    
	  int count = 0;
      for(int i = 0; i < sentence.length(); i++)
      {
          if(sentence.charAt(i) == letter) {
              count++;
          }
      }
      System.out.println("Input contains :" + letter +" total "+ count );
  }
  public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter sentence or word: ");
      String sentence = scan.nextLine();
      System.out.print("Enter a letter: ");
      char letter = scan.next().charAt(0);
      
      harfBul(sentence,letter);

      
      
      ********diger cozum *********
 	 public static void  main(String[] args) {
	      
			 Scanner input = new Scanner(System.in);
				 
				 String sentence, letter;
				 
				 int letterCount = 0;
				 
				 System.out.println("cumle gır :");
				 
				 sentence= input.nextLine();
				 
				 System.out.println("harf gir :");
				 
				 letter= input.next();
				 
				for (int i = 0; i < sentence.length() -1; i++) 
					
				{
					if (sentence.substring(i, i+1).equals(letter)) 
						
						letterCount++;
				}
						System.out.println("cumlede "+ letterCount+ " adet var");
				
				 
						
						
						
/*  *******calısan kod************
 * 
 * 	Scanner input = new Scanner(System.in);
	String   text = input.nextLine();
	// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter text to find the number 'b' in the text:");
		String input=scan.nextLine();
		countLettersb(input, 'b'); // System.out.println(countLettersb(input,'b'));
		System.out.println("Input contains "+(countLettersb(input, 'b'))+ " 'b' letters");
	}
	public static int countLettersb(String text, char letter) {
		int piece = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter)
				piece++;
		}
		return piece;
	}

} 
 * */						
 