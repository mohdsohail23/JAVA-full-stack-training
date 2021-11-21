package hit.mod1.level2.day3;
public class GovtOfOmarRA {
	public static void main(String[] args) {
		Corporation corporation=new Corporation();
		Revenue revenue=new Revenue();
		Police police=new Police();
		Hospital hospita=new Hospital();
		
		DeathCertificateCommand dcc=new DeathCertificateCommand(corporation, revenue, hospita, police);
		SevaCenter seva=new SevaCenter();
		seva.setCommand(dcc, 1);
		
		seva.executeCommand(1);
	}
}
abstract class Command{
	Corporation corporation;Revenue revenue;Hospital hospital;Police police;
	
	public Command(Corporation corporation, Revenue revenue, Hospital hospital, Police police) {
		this.corporation = corporation;
		this.revenue = revenue;
		this.hospital = hospital;
		this.police = police;
	}
	public abstract void execute();
}
class DummyCommand extends Command{
	public DummyCommand(Corporation corporation, Revenue revenue, Hospital hospital, Police police) {
		super(corporation,revenue,hospital,police);
	}
	@Override
	public void execute() {
		System.out.println("I am dummy yet to be operational...");
	}
}
class DeathCertificateCommand extends Command{
	public DeathCertificateCommand(Corporation corporation, Revenue revenue, Hospital hospital, Police police) {
		super(corporation,revenue,hospital,police);
	}
	@Override
	public void execute() {
		System.out.println("Death certificate command started....");
		police.doInvestigation();
		hospital.doPostMortem();
		revenue.makePayment();
		corporation.giveDeathCertificate();
		System.out.println("Take the death certificate....");
	}
}
class SevaCenter{
	Command command[]=new Command[5];
	public SevaCenter() {
		for(int i=0;i<5;i++) {
			command[i]=new DummyCommand(null, null, null, null);
		}
	}
	public void setCommand(Command c,int slot) {
		command[slot]=c;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}
class Hospital{
	public void doPostMortem() {
		System.out.println("post mortem done...");
	}
}
class Revenue{
	public void makePayment() {
		System.out.println("Payment done to revenue...");
	}
}
class Corporation{
	public void giveDeathCertificate() {
		System.out.println("death certificate given...");
	}
}
class Police{
	public void doInvestigation() {
		System.out.println("Police doing investigation...");
	}
}
