package Day17;
import java.lang.reflect.Proxy;
public class Demo {
	//private static Class c[]={Doctor.class,Pilot.class,Steward.class};
	public static void main(String[] args) {
		
		AlopathyMedicalCollege stanelyMC=new AlopathyMedicalCollege();	//1907
		Object shoiab=new Human();//1974
//		//today iam checking...2021/8/5
		if(shoiab instanceof Doctor){
			System.out.println("shoiab is a doctor...");
		}else{
			System.out.println("shoiab is not a doctor");
		}
//		Doctor doctor=(Doctor)shoiab;
//		doctor.doCure();
		System.out.println("shoiab goes to medical college.....");
		MoleculeFramework.setInterface(Doctor.class);
		shoiab=
			MoleculeFramework.getObject
			(new Object[]{shoiab,stanelyMC});//subjection
		if(shoiab instanceof Doctor){
			System.out.println("shoiab is now a doctor after mixing");
		}
		Doctor doctorshoiab=(Doctor)shoiab;
		doctorshoiab.doCure();
//////////		
//	
	JetAirAcademy ja=new JetAirAcademy();
//////		
		MoleculeFramework.setInterface(Pilot.class);
		MoleculeFramework.setInterface(Steward.class);
	shoiab=MoleculeFramework.getObject
		(new Object[]{shoiab,ja});
		Pilot pilot=(Pilot)shoiab;
		pilot.doFly();
		doctorshoiab=(Doctor)shoiab;
		doctorshoiab.doCure();
//////		
//////		
	}
}
