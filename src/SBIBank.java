
public class SBIBank implements Bankk{

	public SBIBank() {
			System.out.println("This is a SBI bank");
	}
	
	public Integer calculateInterest(Integer amount)
	{
		return amount/2;
	}

}
