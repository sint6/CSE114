
public class RegularPolygon 
{
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon()
	{
		n=3;
		side=1;
		x=y=0;
	}
	
	public RegularPolygon(int a, double b)
	{
		n=a;
		side=b;
		x=y=0;
	}
	
	public RegularPolygon(int a, double b, double c, double d)
	{
		n=a;
		side=b;
		x=c;
		y=d;
	}
	
	public void setN(int a)
	{
		n=a;
	}
	public void setSide(int b)
	{
		side=b;
	}
	public void setX(int c)
	{
		x=c;
	}
	public void setY(int d)
	{
		y=d;
	}
	public int getN()
	{
		return n;
	}
	public double getSide()
	{
		return side;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getPerimeter()
	{
		return side*n;
	}
	public double getArea() 
	{
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}