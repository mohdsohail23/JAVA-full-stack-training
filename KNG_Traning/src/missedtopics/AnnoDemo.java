package missedtopics;
import java.lang.reflect.Field;
public class AnnoDemo {
	public static void main(String[] args) throws Exception{
		CellPhone myPhone=Redmi.getCellPhone();
		
		System.out.println(myPhone.camera);
	}
}
class Redmi{
	public static CellPhone getCellPhone() throws Exception{
		CellPhone cellPhone=new CellPhone();
		Class c=cellPhone.getClass();
		Field f=c.getDeclaredField("camera");
		f.setAccessible(true);
		In in=f.getAnnotation(In.class);
		if(in!=null) {
			cellPhone.camera=new Camera();
		}
		return cellPhone;
	}
}
class CellPhone{
	
	@In   //- dependency injection
	(qualifier = "")
	public Camera camera;
}
class Camera{}

