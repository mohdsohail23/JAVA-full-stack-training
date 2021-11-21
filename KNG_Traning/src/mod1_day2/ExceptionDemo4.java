package mod1_day2;
public class ExceptionDemo4{
	public static void main(String[] args) {
		RockySapant1 heroine=new RockySapant1();
		try {
			heroine.buyDress();
		}catch(CameraException ce) {
			System.out.println("Exception is...:"+ce);
		}
		
		System.out.println(new Bus());
	}
}
class Bus{
	@Override
	public String toString() {
		return "This is bus class object...";
	}
}
class RockySapant1{
	public void buyDress()throws CameraException
	{
		ShoppingMall1 damal=new ShoppingMall1();
		
			damal.changeDress();
		
	}
}
class ShoppingMall1{
	boolean lock=true;
	public void changeDress() throws CameraException{
		if(lock) {
			
				throw new CameraException("By mistake the camera got switched on....");
			
		}
	}
}
//custom exception
class CameraException extends Exception{
	String msg;
	public CameraException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "camera exception is thrown.................."+this.msg;
	}
}