
public class Stock 
{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock (String s, String n)
	{
		symbol = s;
		name = n;
	}
	public double getChangePercent()
	{
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;	
	}
}
