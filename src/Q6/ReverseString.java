package Q6;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ZİLAN";

		// cevir(str);

		System.out.println(cevir(str));
	}

	private static String cevir(String str) {

		if (str.isEmpty())
			return str;
		return cevir(str.substring(1)) + str.charAt(0);
	}

}

	


