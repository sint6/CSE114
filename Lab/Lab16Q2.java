
public class Lab16Q2 
{
	public static void main(String[] args)
	{
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
	
		System.out.println("Polygon 1 Perimeter : " + r1.getPerimeter() + " Area: " + r1.getArea());
		System.out.println("Polygon 2 Perimeter : " + r2.getPerimeter() + " Area: " + r2.getArea());
		System.out.println("Polygon 3 Perimeter : " + r3.getPerimeter() + " Area: " + r3.getArea());
	}
}
