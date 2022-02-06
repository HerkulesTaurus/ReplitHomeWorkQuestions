package Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OdevSoru2 {

	/* String 2D array olustur ​ {{"$12" , "$22" , "5$"},{"â‚¬9" , "â‚¬40" , "$1"
	 * ,"$2"}, {"â‚¬12"}} ​String de $ varsa 3.2 ile Carp ​ String de â‚¬ varsa 4.2
	 * ile Carp ​ double return et
	 */

	public static void main1(String[] args, Object str, List<String> listSayilar) {

//Koda burdan baslayin
	
				
				String arr[][] = { { "$12", "$22", "$5" }, { "£9", "£40", "$1", "$2" }, { "£12" } };
				double dolar = 0;
				double pound = 0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j].contains("$")) {
							String sayi = arr[i][j].replace("$", "");
							System.out.println(sayi + " dolar");
							dolar = 3.2 * (Integer.parseInt(sayi));
							System.out.println(dolar + " tl");​
						}
						if (arr[i][j].contains("£")) {
							String sayi = arr[i][j].replace("£", "");
							System.out.println(sayi + " pound");
							pound += 4.2 * (Integer.parseInt(sayi));
							System.out.println(pound + " tl");
						}
					}
				}
		​
				System.out.println("Toplam dolar: " + dolar);
				System.out.println("Toplam pound: " + pound);
		​
			}
			}
	

		