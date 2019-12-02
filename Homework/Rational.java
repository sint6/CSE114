
public class Rational 
{
	private int numerator;
	private int denominator;
	
	public Rational(int a, int b)
	{
		numerator = a/gcf(a,b);
		denominator = b/gcf(a,b);
	}
	public int gcf(int a,int b)
	{
		int result = Math.min(a, b);
		while(!((a%result == 0)&&(b % result == 0))) 
		{
		result--;
		}
		return result;
	}
	public String print()
	{
		return numerator + "/" + denominator;
	}
	public Rational add(Rational c)
	{
		int n = numerator*c.denominator+c.numerator*denominator;
		int d = denominator*c.denominator;
		return new Rational(n,d);
	}
	public Rational subtract(Rational c)
	{
		int n = numerator*c.denominator-c.numerator*denominator;
		int d = denominator*c.denominator;
		return new Rational(n,d);
	}
	public Rational multiply(Rational c)
	{
		int n = numerator*c.numerator;
		int d = denominator*c.denominator;
		return new Rational(n,d);
	}
	public Rational divide(Rational c)
	{
		int n = numerator*c.denominator;
		int d = denominator*c.numerator;
		return new Rational(n,d);
	}
	
}
