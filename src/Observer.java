
public class Observer {
	String ObserverName = "";

	public Observer(String ObserverName) {
		this.ObserverName = ObserverName;
			System.out.println("Observing the stock"+ObserverName);
	}

	public void updateStock(Stock stock)
	{
		System.out.println("The stock prices are:"+stock.getPrice()+"The stock unit are:"+stock.getNumbers());
	}
	
	public static void main(String [] args)
	{
		Observer obs = new Observer("IBM");
		Stock st = new Stock(5000,20);
		st.registerObserver(obs);
		st.updateObserver();
		
	}
	
}
