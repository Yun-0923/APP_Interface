package interfacePayable;

public class HourlyEmployee extends Employee {
	private double wags;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String idNumber, double wags,double hours) 
	{
		super(firstName,lastName,idNumber);
		
		this.setWags(wags);
		this.setHours(hours);
	}
	
	public double getWags() {
		return wags;
	}

	public void setWags(double wags) {
		if(wags < 183) {
			throw new IllegalArgumentException("時薪金額錯誤，wags 欄位必須>=183");
		}
		this.wags = wags;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if((hours < 0.0) ||(hours > 160)) {
			throw new IllegalArgumentException("時數錯誤，hours 欄位必須介於0~160");
		}
		this.hours = hours;
	}

	public double getPaymentAmount() {
		if(this.getHours()<=40) {
			return this.getWags()*this.getHours();
		}
		else { 
			return (this.getWags()*40)+((this.getHours() - 40)*this.getWags()*1.5);
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.1f%n%s: %.1f%n%s: %.1f%n",
				"領時薪的員工-姓名", this.getLastName(), this.getFirstName(),
				"身分證字號",this.getIdNumber(),
				"時薪",this.getWags(),
				"工時",this.getHours(),
				"總薪資",this.getPaymentAmount());
	}
}
