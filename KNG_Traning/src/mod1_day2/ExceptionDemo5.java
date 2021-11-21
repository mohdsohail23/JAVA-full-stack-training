package mod1_day2;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		ATM canaraATM=new ATM();
		try {
			canaraATM.withDrawMoney(2000);
			System.out.println("swaha.............");
		}catch(MaxLimitForWithDrawException e) {
			System.out.println(e);
			System.out.println("Please enter a value lesser than 2000....");
		}
	}
}
class ATM{
	public void withDrawMoney(int amt) throws MaxLimitForWithDrawException{
		if(amt>=2000) {
			throw new MaxLimitForWithDrawException("Amount is greater than or equal to 2000....");
		}
	}
}
//custom exception class
class MaxLimitForWithDrawException extends Exception{
	String msg;
	public MaxLimitForWithDrawException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception is........."+this.msg;
	}
}
