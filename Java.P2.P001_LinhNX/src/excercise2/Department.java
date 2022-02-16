package excercise2;

import java.util.List;
import java.util.Scanner;

public class Department {
	private String departmentName;
	private SalariedEmployee se;
	private HourlyEmployee he;
	
	public Department() {
		
	}

	public Department(SalariedEmployee se, String departmentName) {
		this.se = se;
		this.departmentName = departmentName;
	}
	
	public Department(HourlyEmployee he, String departmentName) {
		this.he = he;
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public SalariedEmployee getSe() {
		return se;
	}

	public void setSe(SalariedEmployee se) {
		this.se = se;
	}

	public HourlyEmployee getHe() {
		return he;
	}

	public void setHe(HourlyEmployee he) {
		this.he = he;
	}


	@Override
	public String toString() {
		if(se!=null) {
			return se.toString()+"Department [departmentName=" + departmentName + "]]\n";
		}else {
			return he.toString()+"Department [departmentName=" + departmentName + "]]\n";
		}
		
	}
	
}
