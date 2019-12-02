import java.util.Scanner;

public class Q2Rational
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numerator for the first rational number: ");
		int num = input.nextInt();
		System.out.print("Enter denominator for the first rational number: ");
		int den = input.nextInt();
		Rational f1 = new Rational(num,den);
		
		System.out.print("Enter numerator for the second rational number: ");
		num = input.nextInt();
		System.out.print("Enter denominator for the first rational number: ");
		den = input.nextInt();
		Rational f2 = new Rational(num,den);
		
		System.out.println("First rational number is: " + f1.print());
		System.out.println("Second rational number is: " + f2.print());
		
		Rational fAdd = f1.add(f2);
		System.out.println("Addition of the rational numbers is: " + fAdd.print());
		Rational fSubtract = f1.subtract(f2);
		System.out.println("Subtraction of the rational numbers is: " + fSubtract.print());
		Rational fMultiply = f1.multiply(f2);
		System.out.println("Multiplication of the rational numbers is: " + fMultiply.print());
		Rational fDivide = f1.divide(f2);
		System.out.println("Division of the rational numbers is: " + fDivide.print());
		
		input.close();
	}
}
