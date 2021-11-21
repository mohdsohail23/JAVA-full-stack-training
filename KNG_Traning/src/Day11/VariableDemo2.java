package Day11;

public class VariableDemo2 {

	public static void main(String[] args) {
		
			//Static fields can be directly accessed, you don't need to create a instance
			//of the class, because JVM instantiates all static fields and static methods.
			//Static fields/variables are shared by multiple instances of the class.
			
			TrainingRoom.toilet="default toilet...";
			System.out.println(TrainingRoom.toilet);
			
			TrainingRoom room1=new TrainingRoom();
			room1.projector="sanyo";
			TrainingRoom.toilet="western";
			
			TrainingRoom room2=new TrainingRoom();
			//room2.projector="huwai";
			//room2.toilet="indian";
			
			System.out.println(room1.projector+":"+TrainingRoom.toilet);
			System.out.println(room2.projector+":"+TrainingRoom.toilet);		

	}
}
	class TrainingRoom{
		String projector;//instance variable
		static String toilet;//class variable..

	}
