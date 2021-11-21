package Day8;

public class Escape_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jack and jill went \"up\" the hill");
		System.out.println("jack and jill went \'up\' the hill");
		System.out.println("jack and jill went \n up \n the hill");
		System.out.println("jack and jill went \\ up\\ the hill");
		System.out.println("jack and jill went \f up \f the hill");
		System.out.println("hello\b\ba");
		
		int i=1;
		while(i<1000000) {
			System.out.print(i+"\r");
			i++;
		}
	}

}
