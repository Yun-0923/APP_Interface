package interfacePayable;

public class BasePlusCommissionEmployee extends CommissionEmployee{
private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String idNumber, double grossSales, double commissionRate,double baseSalary) 
	{
		super(firstName,lastName,idNumber,grossSales,commissionRate);
		
		this.setBaseSalary(baseSalary);
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("底薪金額錯誤，baseSalary 欄為必須>=0");
		}
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return this.getBaseSalary() +( this.getGrossSales()* this.getCommissionRate()) ;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.1f%n%s: %.1f%n",
				"領底薪+佣金的員工-姓名", this.getLastName(), this.getFirstName(),
				"身分證字號",this.getIdNumber(),
				"銷售金額",this.getGrossSales(),
				"佣金比例",this.getCommissionRate(),
				"底薪薪資",this.getBaseSalary(),
				"薪資",this.getPaymentAmount());
	}
}
