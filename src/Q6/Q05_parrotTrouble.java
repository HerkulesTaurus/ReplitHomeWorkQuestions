package Q6;

public class Q05_parrotTrouble {

		/* 
		We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

		parrotTrouble(true, 6) → true
		parrotTrouble(true, 7) → false
		parrotTrouble(false, 6) → false
		*/
		
	public boolean parrotTrouble(boolean talking, int hour) {
		  
		  return(talking && (hour < 7|| hour > 20));
		  
		}
		  // Need extra parenthesis around the || clause
		  // since && binds more tightly than ||
		  // && is like arithmetic *, || is like arithmetic +	
		
	/* 
	 * Expected	Run		
parrotTrouble(true, 6) → true	true	OK	
parrotTrouble(true, 7) → false	false	OK	
parrotTrouble(false, 6) → false	false	OK	
parrotTrouble(true, 21) → true	true	OK	
parrotTrouble(false, 21) → false	false	OK	
parrotTrouble(false, 20) → false	false	OK	
parrotTrouble(true, 23) → true	true	OK	
parrotTrouble(false, 23) → false	false	OK	
parrotTrouble(true, 20) → false	false	OK	
parrotTrouble(false, 12) → false	false	OK	
	 * 
	 */
		
		
		
		
		
		
	}

}
