package Day12;

public class Complextype {
	public static void main(String[] args) {
		TrainingRoomComplexType.toilet=new Toilet();//"Indian Toilet..";
		
		TrainingRoomComplexType gandhi=new TrainingRoomComplexType();
		gandhi.projector=new Projector();
		gandhi.learn(new NotePad());
		gandhi.learn(new NotePad());
		gandhi.learn(new NotePad());
		gandhi.learn(new NotePad());
		gandhi.learn(new NotePad());
		
		TrainingRoomComplexType nehru=new TrainingRoomComplexType();
		
		TrainingRoomComplexType tagore=new TrainingRoomComplexType();
		
		System.out.println("Projector present in gandhi room..:"+gandhi.projector);
		System.out.println("Projector present in nehru room..:"+nehru.projector);
		System.out.println("Projector present in tagore room..:"+tagore.projector);
		
		System.out.println("Toilet of Gandhi Room...:"+TrainingRoomComplexType.toilet);
		System.out.println("Toilet of Nehru Room...:"+TrainingRoomComplexType.toilet);
		System.out.println("Toilet of Tagore Room...:"+TrainingRoomComplexType.toilet);
	}
}
class TrainingRoom{
	String projector;//instance variable
	static String toilet;//class variable
}
class TrainingRoomComplexType{
	Projector projector;
	static Toilet toilet;
	void learn(NotePad n) {//local variable
		System.out.println(n);
	}
}
class Projector{}
class Toilet{}
class NotePad{}
