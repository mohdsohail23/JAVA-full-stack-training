package Day14;

public class Test {
	public static void main(String args[]) {
		int counter = 0;
		L1:
			for (int i=0; i<0; i++) {
				L2:{
					int j=0;
					while (j<10) {
						if (j<1) break L2;
						if (i==j) {
							counter ++;
							continue L1;
						}
					}
				counter --;
				}
				System.out.println(counter);
				
	}
	}
}

