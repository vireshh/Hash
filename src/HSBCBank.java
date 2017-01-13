
public class HSBCBank implements Bankk {

	public HSBCBank() {
		System.out.println("This is HSBC bank");
	}
	
	public Integer calculateInterest(Integer amount)
	{
		return ((amount*5)/100)/2;
	}
}
