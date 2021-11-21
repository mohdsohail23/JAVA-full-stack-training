package Day15;

public class SuperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class A {
			int i, j;
			void showij() {
			System.out.println("i and j: " + i + " " + j);
			}
			}
			// Create a subclass by extending class A.
			class B extends A {
			int k;
			void showk() {
			System.out.println("k: " + k);
			}
			void sum() {
			System.out.println("i+j+k: " + (i+j+k));
			}
			}
	}

}
