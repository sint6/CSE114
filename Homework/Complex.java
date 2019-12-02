
public class Complex 
{
	private double realPart;
	private double imaginaryPart;
	
	public Complex()
	{
		realPart=0;
		imaginaryPart=0;
	}
	
	public Complex(double n1, double n2)
	{
		realPart=n1;
		imaginaryPart=n2;
	}
	
	public Complex add(Complex c)
	{
		realPart += c.realPart;
		imaginaryPart += c.imaginaryPart;
		return new Complex(realPart,imaginaryPart);
	}
	public Complex subtract(Complex c)
	{
		realPart -= c.realPart;
		imaginaryPart -= c.imaginaryPart;
		return new Complex(realPart,imaginaryPart);
	}
	public double getRealPart()
	{
		return realPart;
	}
	public double getImaginaryPart() 
	{
		return imaginaryPart;
	}
}
