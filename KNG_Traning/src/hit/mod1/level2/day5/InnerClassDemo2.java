package hit.mod1.level2.day5;
public class InnerClassDemo2 {
	public static void main(String[] args) {
		ConsultancyCompany myCompany=new ConsultancyCompany();
		Reliance reliance=new Reliance();
		
		reliance.doBusiness(myCompany);
	}
}
class Reliance {
	public void doBusiness(ConsultancyCompany cc) {
		Business b=cc.business();
		b.doBusiness();
	}
}
class ConsultancyCompany{
	public Business business() {
//		class PhilipKotlerBusiness implements Business{	
//			@Override
//			public void doBusiness() {
//				System.out.println("sell the benefits and not the product.....");
//				System.out.println("advertisement is the accelerator of the business...");
//				System.out.println("truth and quality are the keys for success...");
//				System.out.println("maintain quality...");
//			}
//		}
//		new PhilipKotlerBusiness().doBusiness();
//		Business b=new Business() {		
//			@Override
//			public void doBusiness() {
//				System.out.println("sell the benefits and not the product.....");
//				System.out.println("advertisement is the accelerator of the business...");
//				System.out.println("truth and quality are the keys for success...");
//				System.out.println("maintain quality...");
//			}
//		};
		
//		Business b=ConsultancyCompany::excellentProvenBusinessPractice;//method referencing
		Business b=()->{//lambda syntax
			System.out.println("sell the benefits and not the product.....");
			System.out.println("advertisement is the accelerator of the business...");
			System.out.println("truth and quality are the keys for success...");
			System.out.println("maintain quality...");
		};
		return b;
	}
	public static void excellentProvenBusinessPractice() {
		System.out.println("catch the politicians job will get over....");
	}
}
interface Business{
	public void doBusiness();
}