package Q6;

public class Q04_mutlakFark {

// Given an int n, return the absolute 
// difference between n and 21, except return double 
	// the absolute difference if n is over 21.

	public int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else {
			return (n - 21) * 2;

		}
	}
}

/*
 * Expected Run 
 * diff21(19) → 2 2 OK 
 * diff21(10) → 11 11 OK 
 * diff21(21) → 0 0 OK
 * diff21(22) → 2 2 OK 
 * diff21(25) → 8 8 OK 
 * diff21(30) → 18 18 OK 
 * diff21(0) → 21 21 OK 
 * diff21(1) → 20 20 OK 
 * diff21(2) → 19 19 OK 
 * diff21(-1) → 22 22 OK
 * diff21(-2) → 23 23 OK 
 * diff21(50) → 58 58 OK
 * 
 */