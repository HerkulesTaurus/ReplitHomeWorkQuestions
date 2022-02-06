package Q6;

public class Random {

	public static void main(String[] args) {

double dSayi2 = Math.random();
/* random() metodunun kullanımı. */

System.out.println("Rastgele çekilen double sayı  : " + dSayi2);

int iSayi = (int) (Math.random() * 100);

System.out.println("Rastgele çekilen int    sayı  : " + iSayi);

/* rastgele sayılara aralık verme (1 ile 10 arasında) */

int iSayi2 = (int) (Math.random() * 9 + 1);

System.out.println("1 ile 10 arası çekilen int sayı: " + iSayi2);
	
	
	}

	public int nextInt(int number) {

		return 0;
	}

}
