import java.util.ArrayList;
import java.util.Iterator;

public class Stock {
	
	Integer price;
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	Integer numbers;
	
	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	ArrayList<Observer> observers = null;

	public Stock(Integer stockprice,Integer number) {
		observers  = new ArrayList<Observer>();	
		price = stockprice;
		numbers = number;
	}

	public void registerObserver(Observer obsrv)
	{
		observers.add(obsrv);
	}
	
	public void updateObserver()
	{
		Iterator it = observers.iterator();
		while(it.hasNext())
		{
			Observer ob = (Observer)it.next();
			ob.updateStock(this);
		}
		
	}
}
