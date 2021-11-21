package Day17;

public class Demo1 {
	public static void main(String[] args) {
		Dancer dancing=(Dancer)getInstitute();
		dancing.doDance();
		
		Doctor doctor=(Doctor)getInstitute();
		doctor.doCure();
	}
	public static Object getInstitute() {
		return new Institute();
	}
}
class Institute implements Doctor,Dancer{
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doDance() {
		// TODO Auto-generated method stub
		
	}
}

interface Dancer{
	public void doDance();
}