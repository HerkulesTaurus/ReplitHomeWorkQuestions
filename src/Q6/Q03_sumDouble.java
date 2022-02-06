package Q6;

public class Q03_sumDouble {
// Given two int values, return their sum. 
// Unless the two values are the same, 
// then return double their sum.
	
	public int sumDouble(int a, int b) {
		   // Store the sum in a local variable
		  int sum = a + b;
		  
		  // Double it if a and b are the same
		  if(a == b){
		    sum = sum * 2;
		  }
		  
		  return sum;

		}
}

// Expected	Run		
// sumDouble(1, 2) → 3	3	OK	
// sumDouble(3, 2) → 5	5	OK	
// sumDouble(2, 2) → 8	8	OK	
// sumDouble(-1, 0) → -1	-1	OK	
// sumDouble(3, 3) → 12	12	OK	
// sumDouble(0, 0) → 0	0	OK	
// sumDouble(0, 1) → 1	1	OK	
// sumDouble(3, 4) → 7	7	OK	
