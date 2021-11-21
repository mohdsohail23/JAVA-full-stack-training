package Day13;

public class AmaravathyDemo {
	public static void main(String[] args) {
		System.out.println("Knightingale government....");
		
		Roads singaporeRoads=new Roads();
		AirPort adaniAirport=new AirPort();
		RailwayStation japaneseBullenTrain=new RailwayStation();
		BusStand dubaiBusStand=new BusStand();
		Water gangaWater=new Water();
		Drainage londonDrainage=new Drainage();
		
		GoodAmaravthyHome.buildInfra(singaporeRoads, dubaiBusStand, japaneseBullenTrain,
				adaniAirport, gangaWater, londonDrainage);
		
		BuyPlot ishthiaqSaabPlot=new BuyPlot();
		GovtApproval istApproval=new GovtApproval();
		
		
		BuyPlot saravananPlot=new BuyPlot();
		GovtApproval sarApproval=new GovtApproval();
		
		GoodAmaravthyHome istHome=new GoodAmaravthyHome(ishthiaqSaabPlot, istApproval);
		istHome.buildHome();
		
		GoodAmaravthyHome sarHome=new GoodAmaravthyHome(saravananPlot, sarApproval);
		sarHome.buildHome();
		
	}
}
class BadAmaravathy{
	public void buildMonument() {
		//this job was going on for 5 years.....
		while(true) {}
	}
}
class GoodAmaravthyHome{
	static Roads roads;
	static BusStand busStand;
	static RailwayStation railwayStation;
	static AirPort airport;
	static Water water;
	static Drainage drainage;
	
	
	BuyPlot bp;
	GovtApproval approval;
	public static void buildInfra(Roads roads,BusStand busStand,RailwayStation railwayStation,
			AirPort airport,Water water,Drainage drainage
			) {
		GoodAmaravthyHome.roads=roads;
		GoodAmaravthyHome.busStand=busStand;
		GoodAmaravthyHome.railwayStation=railwayStation;
		GoodAmaravthyHome.airport=airport;
		GoodAmaravthyHome.water=water;
		GoodAmaravthyHome.drainage=drainage;
		
	
		
	}
	public GoodAmaravthyHome(BuyPlot bp,GovtApproval approval) {
		this.bp=bp;this.approval=approval;
	}
	
	public void buildHome() {
		System.out.println("I am using....:"+GoodAmaravthyHome.roads);
		System.out.println("I am using....:"+GoodAmaravthyHome.busStand);
		System.out.println("I am using....:"+GoodAmaravthyHome.railwayStation);
		System.out.println("I am using....:"+GoodAmaravthyHome.airport);
		System.out.println("I am using....:"+GoodAmaravthyHome.water);
		System.out.println("I am using....:"+GoodAmaravthyHome.drainage);
		
		
		System.out.println("I got approval to build home...:"+this.approval);
		System.out.println("I purchase plot to build home...:"+this.bp);
		
		System.out.println("I am building home.........:)::::::::::");
	}
}
class Roads{
	@Override
	public String toString() {
		return "singapore like roads";
	}
}
class BusStand{
	@Override
	public String toString() {
		return "Bus-stand with terminals";
	}
}
class RailwayStation{
	@Override
	public String toString() {
		return "central railway station";
	}
}
class AirPort{
	@Override
	public String toString() {
		return "Airport with internal flights";
	}
}
class Water{
	@Override
	public String toString() {
		return "Tap water system";
	}
}
class Drainage{
	@Override
	public String toString() {
		return "Metropolitan drainage system";
	}
}
class BuyPlot{
	@Override
	public String toString() {
		return "Amaravathy plot number:"+ hashCode();
	}
}
class GovtApproval{
	@Override
	public String toString() {
		return "Muncipal approval plot number:"+ hashCode();
	}
}