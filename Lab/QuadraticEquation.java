
public class QuadraticEquation 
{
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double x, double y, double z)
	{
		a = x;
		b = y;
		c = z;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public double getDiscriminant()
	{
		return (b*b) - (4*a*c);
	}
	
	public double getRoot1()
	{
		return (-b+(Math.pow(getDiscriminant(),0.5))) / (2*a);
	}
	
	public double getRoot2()
	{
		return (-b-(Math.pow(getDiscriminant(),0.5))) / (2*a);
	}
}

