package Day16;
//object reusability
public class RevisionGen2 {
	public static void main(String[] args) {
		Hall sHall=new Hall();
		sHall.party=new BirthDayParty();
		
		GeneralHall gHall=new GeneralHall();
		gHall.party=new BirthDayParty();
		gHall.party=new EngagementParty();
	}
}
class Hall{// specific hall - only for birthday - it is not reusable for other parties
	BirthDayParty party;
}
class GeneralHall{// generic hall - for any party - it is reusable for all parties
	Party party;
}
class Party{
	
}
class BirthDayParty extends Party{}
class EngagementParty extends Party{}