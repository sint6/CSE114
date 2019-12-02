//Sint Kaung
//112776130

public class Square extends TwoDimensionalShape
{
    private double side;

    public Square()
    {
        side = 1.0;
    }

    public Square(double newSide)
    {
        side = newSide;
    }
    public double getSide()
    {
        return side;
    }
    public double getArea()
    {
        return (Math.pow(getSide(), 2));
    }

    public String toString()
    {
        return super.toString() + 
                "\nSide: " + getSide();
    }
}