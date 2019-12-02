import java.util.Scanner;

public class Lab17Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
        LinearEquations q = new LinearEquations(a,b,c,d,e,f);

        if (q.isSolvable())
        {
            System.out.println("x is " + q.getX() + " and y is " + q.getY());
        }
        else 
            System.out.println("The equation has no solutions.");

        input.close();
    }
}