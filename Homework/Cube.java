//Sint Kaung
//112776130

public class Cube extends ThreeDimensionalShape 
{
    private double side;
 
    public Cube(double newSide) 
    {
        side = newSide;
    }
 
    public double getSide() 
    {
        return side;
    }
 
    public double getArea() 
    {
        return 6 * Math.pow(getSide(), 2);
    }
 
    public double getVolume() 
    {
        return Math.pow(getSide(), 3);
    }

    public String toString()
    {
        return super.toString() + 
                "\nSide: " + getSide();
    }
}