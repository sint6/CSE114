
public class Lab16Q1 
{
	public static void main(String[] args)
	{
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		
		System.out.println(s.symbol);
		System.out.println(s.name);
		System.out.println("Price-Change Percentage: " + s.getChangePercent());
	}
}
