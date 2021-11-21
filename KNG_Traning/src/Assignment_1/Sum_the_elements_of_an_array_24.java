package Assignment_1;

public class Sum_the_elements_of_an_array_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40, 50, 10}; 
		int sum = 0; 
		//Advanced for loop
		for( int num : array) { 
		 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum);
	}

}
