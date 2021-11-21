package Day20;
//arrays behave as pass by reference, because they are objects
public class ArrayPBR {
	public static void main(String[] args) {
		int i[]= {10};
		System.out.println("Before passing...i..:"+i[0]);
		int copyI[]=new int[1];
		System.arraycopy(i,0,copyI,0,1);
	//	System.arraycopy(sourcearray,source array starting point of copy,
	//  destination array, pasting start point, pasting end point)
	
		met(copyI);
		System.out.println("After passing...i...:"+i[0]);
	}
	
	static void met(int i[]) {
		i[0]=20;
	}
}
