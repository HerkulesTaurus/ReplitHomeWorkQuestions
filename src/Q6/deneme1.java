package Q6;


class Parent {


		private void m1(){ 

			System.out.println("Parent class'da private access modifier"); 

		} 

		protected void m2(){ 

			System.out.println("Parent class'da protected access modifier"); 

		} 

	} 



class Child extends Parent { 

		private void m1(){ 

			System.out.println("Child class'da private access modifier"); 

		} 

		public void m2(){ 

			System.out.println("Child class'da public access modifier"); 

		} 

	} 



	public class deneme1 { 

		public static void main(String[] args){ 


			Parent obj1 = new Parent(); 
			obj1.m1();
		Child obj2 =new Child();
		obj2.m1();
		}
		

	} 
	
	


