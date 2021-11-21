package restknights;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employee implements Serializable{
	
	private int eid;
	private String ename;
	private String epass;
	private int esal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String epass, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epass = epass;
		this.esal = esal;
	}
	public final int getEid() {
		return eid;
	}
	public final void setEid(int eid) {
		this.eid = eid;
	}
	public final String getEname() {
		return ename;
	}
	public final void setEname(String ename) {
		this.ename = ename;
	}
	public final String getEpass() {
		return epass;
	}
	public final void setEpass(String epass) {
		this.epass = epass;
	}
	public final int getEsal() {
		return esal;
	}
	public final void setEsal(int esal) {
		this.esal = esal;
	}
}
