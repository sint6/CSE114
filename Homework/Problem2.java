//Sint Kaung
//112776130

public class Problem2
{
    public static void main(String[] args)
    {
        Shape[] s = new Shape[6];

        s[0] = new Circle(2.0);
        s[1] = new Square(2.0);
        s[2] = new Triangle(2.0,1.0);
        s[3] = new Sphere(4.0);
        s[4] = new Cube(3.0);
        s[5] = new Tetrahedron(3.0);

        for (Shape i:s)
        {
            if (i instanceof TwoDimensionalShape)
            {
                System.out.println(((TwoDimensionalShape) i).toString() + "\nArea: " + ((TwoDimensionalShape) i).getArea());
            }
            else if (i instanceof ThreeDimensionalShape)
            {
                System.out.println(((ThreeDimensionalShape) i).toString() + 
                "\nSurface Area: " + ((ThreeDimensionalShape) i).getArea() +
                "\nVolume: " + ((ThreeDimensionalShape) i).getVolume());
            }
        }
    }
}