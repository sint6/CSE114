package Lab18;

public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle()
    {
        side1=side2=side3=1.0;
    }
    public Triangle(double a, double b, double c)
    {
        side1=a;
        side2=b;
        side3=c;
    }
    public void setSide1(double a)
    {
        side1=a;
    }
    public double getSide1()
    {
        return side1;
    }
    public void setSide2(double a)
    {
        side2=a;
    }
    public double getSide2()
    {
        return side2;
    }
    public void setSide3(double a)
    {
        side3=a;
    }
    public double getSide3()
    {
        return side3;
    }
    public double getArea() 
    {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
    public double getPerimeter() 
    {
		return side1 + side2 + side3;
	}
    public String toString() 
    {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
