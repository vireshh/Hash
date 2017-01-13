
public class BankObj {

	public BankObj() {

	}
	
	public Bankk fetchBankObject(String bankObject)
	{
		
		if(bankObject.equals("SBIBank")){
			System.out.println("SBI Bank Object will be returned");
			return new SBIBank();
		}
		if(bankObject.equals("HSBCBank"))
		{
			System.out.println("HSBC Bank Object will be returned");
			return new HSBCBank();
		}
		return null;
	}
	
	public static void main(String [] ars)
	{
		BankObj obj = new BankObj();
		obj.fetchBankObject("SBIBank");
		obj.fetchBankObject("HSBCBank");
	}

}
