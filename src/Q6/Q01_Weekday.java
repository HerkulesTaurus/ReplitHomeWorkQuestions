package Q6;

public class Q01_Weekday {
/*The parameter weekday is true if it is a weekday, and the 
 * parameter vacation is true if we are on vacation. 
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 * 
 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
			  
			if(!weekday||vacation){
			  return true;
			}
			  return false;
			  
			  
			  
			 // Expected	Run		
			 // sleepIn(false, false) → true	true	OK	
			 // sleepIn(true, false) → false	false	OK	
			 // sleepIn(false, true) → true	true	OK	
			 // sleepIn(true, true) → true	true	OK	
			  
			}
	}


