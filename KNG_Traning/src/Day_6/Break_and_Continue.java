package Day_6;

public class Break_and_Continue {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				//when this condition is satisfied, i should NOT CONTINUE - I SHOULD BREAK THE LOOP AND CONTINUE
				continue;//continue with the beginning of the loop
			}
			System.out.println("Odd Numbers...."+i);
		}
		
		boolean b=true;
		a:{
			System.out.println("a block....");
			b:{
				System.out.println("b block.....");
				c:{
					if(b) {
						break b;
					}
					System.out.println("c block....");
				}
				System.out.println("outside c block...");
			}
			System.out.println("outside b block....");
		}
		System.out.println("outside a block...");
		
	}
}