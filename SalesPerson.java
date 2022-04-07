package Employee;

public class SalesPerson extends WageEmployee{
     private int commition;
       
	 public SalesPerson(int Id,String Name,int Salary, int Hours,int Rate,int commition ){
		 super(Id,Name,Salary,Hours,Rate);
		 this.commition=commition;
	 }

	public int getCommition() {
		return commition;
	}

	public void setCommition(int commition) {
		this.commition = commition;
	}
	 public int calculateSalary(){
		 return super.calculateSalary()+commition;
	 }

	public String toString() {
		return super.toString()+"SalesPerson [commition=" + commition + "]";
	}

	 

}
