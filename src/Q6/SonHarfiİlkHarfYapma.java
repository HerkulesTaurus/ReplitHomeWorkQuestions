package Q6;

public class SonHarfiÄ°lkHarfYapma {

		public String backAround(String str) {
			  // Get the last char
			  String last = str.substring(str.length() - 1);
			  return last + str + last;
			}
}
