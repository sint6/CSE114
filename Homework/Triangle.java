//Sint Kaung
//112776130

public class Triangle extends TwoDimensionalShape
{
    private double base;
    private double height;

    public Triangle()
    {
        base = 1.0;
        height = 1.0;
    }

    public Triangle(double newBase, double newHeight)
    {
        base = newBase;
        height = newHeight;
    }
    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return (base*height)/2;
    }

    public String toString()
    {
        return super.toString() + 
                "\nBase: " + getBase() +
                "\nHeight: " + getHeight();
    }
}