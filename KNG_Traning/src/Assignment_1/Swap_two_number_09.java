package Assignment_1;

public class Swap_two_number_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first = 3.50f, second = 5.50f; 
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second); 
		
		float temporary = first; 
	
		first = second; 
		
		second = temporary; 
		 System.out.println("--After swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second); 
	}

}
