
public class Lab14Q1 
{
	public static void main(String[] args)
	{
	Rectangle r1 = new Rectangle(4,40);
	Rectangle r2 = new Rectangle(3.5,35.9);
	
	System.out.println("Width: " + r1.width);
	System.out.println("Height: " + r1.height);
	System.out.println("Area: " + r1.getArea());
	System.out.println("Perimeter: " + r1.getPerimeter());
	System.out.println();
	System.out.println("Width: " + r2.width);
	System.out.println("Height: " + r2.height);
	System.out.println("Area: " + r2.getArea());
	System.out.println("Perimeter: " + r2.getPerimeter());
	}
}
