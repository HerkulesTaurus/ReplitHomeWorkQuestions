package Q6;

import java.util.Scanner;

public class Deneme {
		
		 public static void main(String[] args) {
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
			}
	
	
	
	
	
