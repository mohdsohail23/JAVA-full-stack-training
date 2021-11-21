package Day20;
public class GarbageDemo {
	public static void main(String[] args) {
		GrandFather daddu=new GrandFather();
		//System.out.println(daddu.getGold());
		
		daddu=null;//this is taken care by GC in real applications
		System.gc();//this also taken care by GC in real applications
		
		//System.out.println(daddu.getGold());
	}
}
class GrandFather{
	private String gold="gold is inside a trunk....";
	
	protected String getGold() {
		return gold;
	}
	
	//finalize is like will document - gets called when GC removes this object or when it kills/destroys the object
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called...");
		System.out.println(getGold());
	}
}
