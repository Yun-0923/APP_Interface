package interfacePayable;

public class Invoice extends Object implements Payable{
	
	private String partNumber;
	private String partDescription;
	private double pricePerItem;
	private int quantity;
	
	public Invoice(String partNumber,String partDescription,double pricePerItem,int quantity) {
		super();
		
		this.setPartDescription(partDescription);
		this.setPartNumber(partNumber);
		this.setPricePerItem(pricePerItem);
		this.setQuantity(quantity);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		if(partNumber.equals("")) {
			throw new IllegalArgumentException("物品編號輸入錯誤，partNumber 欄位不可以為空白");
		}
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		if(partDescription.equals("")) {
			throw new IllegalArgumentException("物品描述輸入錯誤，partDescription 欄位不可以為空白");
		}
		this.partDescription = partDescription;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0.0) {
			throw new IllegalArgumentException("物品單價輸入錯誤，pricePerItem 欄位要 > 0");
		}
		this.pricePerItem = pricePerItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("數量輸入錯誤，quantity 欄位要 > 0");
		}
		this.quantity = quantity;
	}
	
	public double getPaymentAmount() {
		return this.getPricePerItem()* this.getQuantity();
	}
	
	@Override
	public String toString() {
	    return String.format("%n%s%n%s: %s%n%s: %s%n%s: %.1f%n%s: %d%n%s: %.1f%n",
	            "供應商應付款項-貨品", 
	            "貨物編號", this.getPartNumber(), "貨品描述", this.getPartDescription(),
	            "貨品單價", this.getPricePerItem(), 
	            "貨品數量", this.getQuantity(), 
	            "貨品應付金額", this.getPaymentAmount());
	}
	
}
