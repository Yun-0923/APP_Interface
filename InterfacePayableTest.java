package interfacePayable;

public class InterfacePayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		Payable payableArray[] = new Payable[10];
		
		payableArray[0] = new Invoice("S00001","馬褂",5000,4);
		payableArray[1] = new Invoice("S00002","羽絨外套",13000,2);
		payableArray[2] = new SalariedEmployee("小馳","周","D111111111",42000);
		payableArray[3] = new SalariedEmployee("陽明","王","D222222222",40000);
		payableArray[4] = new HourlyEmployee("杰倫","周","A333333333",200,50);
		payableArray[5] = new BasePlusCommissionEmployee("祖賢","王","A4444444444",12000,0.5,10000);
		payableArray[6] = new CommissionEmployee("依林","蔡","A555555555",10000,1.0);
		
		for(i=0; i< payableArray.length; i++) {
			if(payableArray[i] != null) {
				System.out.printf("%n%s%d%s :%n%s%n","第",(i+1),"筆應付帳款資料",payableArray[i].toString());
				
				if(payableArray[i].getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
					BasePlusCommissionEmployee temp = ((BasePlusCommissionEmployee)payableArray[i]);
					temp.setCommissionRate(temp.getCommissionRate()*1.5);
					System.out.printf("%n%s%d%s :%n%s%n","獎金比率提高50%後，第",(i+1),"位員工資料",payableArray[i].toString());
				
					}

			}
		}
	}
}
