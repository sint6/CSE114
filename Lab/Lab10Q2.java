
public class Lab10Q2 {

	public static void main(String[] args) 
	{
		double a = 1;
		double b = 20;
		System.out.println("i		m(i)");
		for (double i=a;i<=b;i++)
		{
			System.out.println(i + "		" + summation(i));
		}
	}
	
	public static double summation(double b)
	{
		double sum=0;
		for (double i=1 ; i<=b ; i++)
			sum += i / (i+1);
		return sum;
	}
}

