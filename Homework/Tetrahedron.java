public class Tetrahedron extends ThreeDimensionalShape 
{
    private double side;
 
    public Tetrahedron(double newSide) 
    {
        side = newSide;
    }
 
    public double getSide() 
    {
        return side;
    }
 
    public double getArea() 
    {
        return Math.sqrt(3) * Math.pow(getSide(), 2);
    }
 
    public double getVolume() 
    {
        return Math.pow(getSide(), 3) / (6 * Math.sqrt(2));
    }
 
    public String toString()
    {
        return super.toString() + 
                "\nSide: " + getSide();
    }
}