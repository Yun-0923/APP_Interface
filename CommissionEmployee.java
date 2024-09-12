package interfacePayable;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String idNumber, double grossSales, double commissionRate) {
		super(firstName,lastName,idNumber);
	
		this.setGrossSales(grossSales);
		this.setCommissionRate(commissionRate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("銷售金額錯誤，grosssales 欄為必須>=0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate < 0.0 || commissionRate > 1.0) {
			throw new IllegalArgumentException("佣金比例錯誤，commissionRate 欄位必須介於0.0~1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	public double getPaymentAmount() {
		return this.getGrossSales()* this.getCommissionRate() ;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.1f%n",
				"領佣金的員工-姓名", this.getLastName(), this.getFirstName(),
				"身分證字號",this.getIdNumber(),
				"銷售金額",this.getGrossSales(),
				"佣金比例",this.getCommissionRate(),
				"薪資",this.getPaymentAmount());
	}
}
