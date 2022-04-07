package Employee;

public class WageEmployee extends Employee{
      private int hours;
      private int rate;
      
     public WageEmployee(int id,String name,int salary,int hours,int rate){
    	setEmployeeId(id); 
    	setEmployeeName(name);
    	setEmployeeSalary(salary);
    	 this.hours=hours;
    	 this.rate=rate;
    	
     }

	public String toString() {
		return  super.toString()+" "+hours+" "+rate;
	}
     public int calculateSalary(){
    	 return hours*rate;
     }
}
