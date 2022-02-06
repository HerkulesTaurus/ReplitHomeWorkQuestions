package Q6;

import java.util.Scanner;

public class KelimeninSonHarfiyleDigerKelimeninİlkHarfiniBirlestirme {

	public static void main(String[] args) {
		/*  
		 Scanner class kullanilarak verilen iki tane Stringi birbirlerine ekle
         Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile ayni ise
         ayni olan harflerin birisini kaldirin
       
       	 ornek: "abc", "cat" --> "abcat"
                "abc", "dog" --> "abcdog" 
        */
		Scanner scan=new Scanner(System.in);
		System.out.println("cumle gir arada bosluk olsun");
				
		String hasan= scan.nextLine();	
		
		while (!hasan.contains(" ")) {
			System.out.println("aga arada bosluk olsun");
			hasan= scan.nextLine();
			
		}
		
		String [] arr=hasan.split(" ");
		String s1 = arr[0];
		String s2 = arr[1];
		String s1sonharf=s1.substring(s1.length()-1);
		String s2ilkharf=s2.substring(0, 1);
		
		
		if (s1sonharf.equals(s2ilkharf)) {
			System.out.println(s1+s2.substring(1));
			
		} else {
			System.out.println(s1+s2);
	}​
 }
}





