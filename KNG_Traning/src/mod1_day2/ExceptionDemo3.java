package mod1_day2;
public class ExceptionDemo3 {
	public static void main(String[] args) throws Exception{
		RockySapant heroine=new RockySapant();
		heroine.buyDress();
	}
}
class RockySapant{
	public void buyDress()throws Exception
	{
		ShoppingMall damal=new ShoppingMall();
		
			damal.changeDress();
		
	}
}
class ShoppingMall{
	boolean lock=true;
	public void changeDress() throws Exception{
		if(lock) {
			
				throw new Exception();
			
		}
	}
}
