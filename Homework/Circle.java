//Sint Kaung
//112776130

public class Circle extends TwoDimensionalShape
{
    private double radius;

    public Circle()
    {
        radius=1.0;
    }

    public Circle(double newRadius)
    {
        radius = newRadius;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return (Math.PI)*(Math.pow(getRadius(), 2));
    }

    public String toString()
    {
        return super.toString() + 
                "\nRadius: " + getRadius();
    }
}