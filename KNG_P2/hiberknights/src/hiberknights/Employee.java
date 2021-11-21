package hiberknights;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "empEntity")
@Table(name = "emp")
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid")
	private int eid;
	
	@Column(name="empname", length = 80,nullable = false)
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

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
}
