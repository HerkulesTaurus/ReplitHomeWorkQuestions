package Q6;

public class Faktoriyel {

	public static void main(String[] args) {
		int sayi=7;
		
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			
			faktoriyel*=i;
		}
		
		System.out.println(faktoriyel);
	}

}
