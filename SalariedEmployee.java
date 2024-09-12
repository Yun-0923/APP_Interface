package interfacePayable;

public class SalariedEmployee extends Employee {
private double salary;
	
	public SalariedEmployee(String firstName, String lastName, String idNumber, double salary) 
	{
		super(firstName,lastName,idNumber);
		
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary < 0.0) {
			throw new IllegalArgumentException("月薪金額錯誤，Salary 欄位必須>=0");
		}
		this.salary = salary;
	}
	
	public double getPaymentAmount() {
		return this.getSalary();
	}
	
	@Override
	public String toString() {
		return String.format("%n%s%n%s: %s %s%n%s: %s%n%s: %.1f%n",
				"員工應付款項-固定薪資","員工-姓名", this.getLastName(), this.getFirstName(),
				"身分證字號",this.getIdNumber(),
				"固定薪資總額",this.getPaymentAmount());
	}
}
