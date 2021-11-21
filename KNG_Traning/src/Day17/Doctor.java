package Day17;

public interface Doctor {
	public void doCure();
}
//interface is a special class whose activity is promised to be implemented by the class which implements it.
//implementation
class UnaniMedicalCollege implements Doctor
{
	@Override
	public void doCure() {
		System.out.println("unani way of cure method called...");
	}
}
class AlopathyMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("Curing as per alopathy medicine...");
	}
}