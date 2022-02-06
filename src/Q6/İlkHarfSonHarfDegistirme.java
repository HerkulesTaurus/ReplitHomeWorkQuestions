package Q6;

public class İlkHarfSonHarfDegistirme {

	public static void main(String[] args) {
	
		public String frontBack(String str) {
				
		
			  if (str.length() <= 1) return str;
			  
			  String kod = str.substring(1, str.length()-1);
			  
			  return str.charAt(str.length()-1) + kod + str.charAt(0);
			
	}

}