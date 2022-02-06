package Q6;

import java.util.Scanner;

public class Q01_ForWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = "John came late";
		
		int aQuantity = 0;

		for (int i = 0; i < str.length(); i++)
			
			if (str.toLowerCase().charAt(i) == 'a')
				
				aQuantity++;
		{

		}

		System.out.println("number of a = " + aQuantity);
	}
}
