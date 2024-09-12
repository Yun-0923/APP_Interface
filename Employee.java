package interfacePayable;

public abstract class Employee extends Object implements Payable{
	private String firstName;
	private String lastName;
	private String idNumber;
	
	
	public Employee(String firstName, String lastName, String idNumber) 
	{		
		super();
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setIdNumber(idNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName.equals("")) {
			throw new IllegalArgumentException("員工資料輸入錯誤，firstName 欄位不允許空白");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName.equals("")) {
			throw new IllegalArgumentException("員工資料輸入錯誤，lastName 欄位不允許空白");
		}
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		if(idNumber.equals("")) {
			throw new IllegalArgumentException("員工資料輸入錯誤，idNumber 欄位不允許空白");
		}
		this.idNumber = idNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%n%s%n%s: %s: %s %s%n%s: %s%n%s",
				"員工基本資料","員工-姓名", this.getLastName(), this.getFirstName(),
				"身分證字號",this.getIdNumber()
				);
	}
}
