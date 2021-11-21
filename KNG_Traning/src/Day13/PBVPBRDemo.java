package Day13;

public class PBVPBRDemo {
	public static void main(String[] args) {
		PBV_ChineseWhisper pbv=new PBV_ChineseWhisper();
		
		String myword="knightingale";
		
		System.out.println("Myword is before passing...:"+myword);
		
		pbv.accept(myword);
		
		System.out.println("Myword is after passing...:"+myword);
		
		Laddu laddu=new Laddu(10);
		
		PBR_IndianLaddu pbr=new PBR_IndianLaddu();
		
		System.out.println("My Laddu size before passing...:"+laddu.size);
		
		pbr.accept(laddu);
		
		System.out.println("My Laddu size after passing....:"+laddu.size);
	}
}
class PBV_ChineseWhisper{
	public void accept(String myword) {
		myword="alexander";
	}
}
class PBR_IndianLaddu{
	
	public void accept(Laddu laddu) {
		laddu.size=laddu.size-8;
	}
	
}
class Laddu{
	public Laddu(int size) {
		this.size=size;
	}
	int size;
}