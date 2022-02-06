package Q6;

import java.util.Scanner;

public class Faktoriyel2 {

	public static void main(String[] args) {
		/*
		 * Scanner class araciligiyla girilen herhangi bir sayinin faktoriyel degerini
		 * bulmak icin bir program yazin. number:6 factorial:1*2*3*4*5*6=720 output --->
		 * 720
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı giriniz");

		int number = scan.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= number; i++) {

			faktoriyel = faktoriyel * i;

		}
		System.out.println(number + "!=" + faktoriyel);
	}
}
