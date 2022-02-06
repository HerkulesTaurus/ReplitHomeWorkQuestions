package Q6;

import java.util.Scanner;

public class Gunler {
public static void main(String[] args) {
		    /*
		     *  Veri tipi int olan variable(degisken) verildiginde
		    *Eger int 1 ise print monday
		    *Eger int 2 ise print tuesday
		    *Eger int 3 ise print wednesday
		    *Eger int 4 ise print thursday
		    *Eger int 5 ise print friday
		    *Eger int 6 ise print saturday
		    *Eger int 7 ise print sunday
		    *Eger int 8 den buyuk ise  print "this is not a valid day"  */
		    
		    
		            Scanner scanner = new Scanner(System.in);
		            
		            
		            //  code Start here don't change before this line          
		            //  kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
		            System.out.println("Please enter a day from 1 to 7 : ");
		           
		            int gunDegeri =scanner.nextInt();
		           
		                
		            switch (gunDegeri) {
		            
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		                
		            default :
		                System.out.println("This is not a valid day");
		                
		                }
		            scanner.close();
	}

}
