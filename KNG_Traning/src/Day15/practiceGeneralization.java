package Day15;

public class practiceGeneralization {
	public static void main(String[] args) {
		Phone phone=new AndroidPhone();
	Phone obj=new phonemodel();
		System.out.println("This phone is:" + phone.phonetype);
		obj.phonemodel();
		
	}
}

abstract class Phone{
	//when I declare a variable final, the variable value cannot be changed.
	 String phonetype="Smartphone";
}	
	
class AndroidPhone extends Phone{
	 public void Phonemodel() {
		System.out.println("It is an Android Phone");
	}
}
class IOSphone extends Phone{
	
}

