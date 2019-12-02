//Sint Kaung
//112776130

public class Sphere extends ThreeDimensionalShape
{
    private double radius;
    
    public Sphere()
    {
        radius = 1.0;
    }
    
    public Sphere(double newRadius) 
    {
        radius = newRadius;    
    }
 
    public double getRadius() 
    {
        return radius;
    }

    public double getArea() 
    {
        return (4.0)*Math.PI*(Math.pow(getRadius(), 2));
    }
 
    public double getVolume() 
    {
        return (4.0/3.0)*Math.PI*(Math.pow(getRadius(), 3));
    }

    public String toString()
    {
        return super.toString() + 
                "\nRadius: " + getRadius();
    }  
}
