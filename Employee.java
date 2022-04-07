package Employee;

public class Employee extends Object {
	 private int EmployeeId;
	 private String EmployeeName;
	 private double EmployeeSalary;
	 private String EmployeeDepartement;
	public Employee() {
	}
	public Employee(int employeeId, String employeeName, double employeeSalary,
			String employeeDepartement) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
		EmployeeDepartement = employeeDepartement;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeeDepartement() {
		return EmployeeDepartement;
	}
	public void setEmployeeDepartement(String employeeDepartement) {
		EmployeeDepartement = employeeDepartement;
	}
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName="
				+ EmployeeName + ", EmployeeSalary=" + EmployeeSalary
				+ ", EmployeeDepartement=" + EmployeeDepartement
				+ ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName()
				+ ", getEmployeeSalary()=" + getEmployeeSalary()
				+ ", getEmployeeDepartement()=" + getEmployeeDepartement()
				+ "]";
	}
	
	public int calculateSalary(){
		return 0;
	}
	 public boolean equals(Object obj) {
		    Employee e2=(Employee)obj;
	   if(this.EmployeeId==e2.getEmployeeId() && this.EmployeeName==e2.getEmployeeName() && this.EmployeeSalary==e2.getEmployeeSalary() &&this.EmployeeDepartement==e2.getEmployeeDepartement()){
	  return true;
	 }
	 return false;
	 }
	 

}
