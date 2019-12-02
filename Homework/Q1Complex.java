import java.util.Scanner;

public class Q1Complex
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter real part of the first complex number: ");
		double real = input.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		double imaginary = input.nextDouble();
		Complex c1 = new Complex(real,imaginary);
		
		System.out.print("Enter real part of the second complex number: ");
		real = input.nextDouble();
		System.out.print("Enter imaginary part of the second complex number: ");
		imaginary = input.nextDouble();
		Complex c2 = new Complex(real,imaginary);
		
		System.out.println("First complex number is: (" + c1.getRealPart() + "," + c1.getImaginaryPart() + ")");
		System.out.println("Second complex number is: (" + c2.getRealPart() + "," + c2.getImaginaryPart()+ ")");
		Complex c3 = c1.add(c2);
		System.out.println("Addition of the complex numbers is: (" + c3.getRealPart() + "," + c3.getImaginaryPart() + ")");
		Complex c4 = c1.subtract(c2);
		System.out.println("Subtraction of the complex numbers is: (" + c4.getRealPart() + "," + c4.getImaginaryPart() + ")");
		input.close();
	}
	
}
