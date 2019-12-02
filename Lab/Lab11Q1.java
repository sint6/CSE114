import java.util.Scanner;

public class Lab11Q1 
{
	public static void main(String[] args)
	{
	double numbers[] = new double[10];
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 10 numbers: ");
	for (int i=0;i<numbers.length;i++)
		numbers[i] = input.nextDouble();
	System.out.printf("The mean is " + "%.2f", mean(numbers));
	System.out.println("\nThe standard deviation is " +  deviation(numbers));
	input.close();
	}
	public static double mean(double[] x)
	{
		double sum=0,mean;
		for (int i=0;i<x.length;i++)
			sum += x[i];
		mean = sum/x.length;
		return mean;
	}
	public static double deviation(double[] x)
	{
		double mean=mean(x), sum=0,std;
		for (int i=0;i<x.length;i++)
			sum += Math.pow((x[i]-mean), 2);
		std = Math.sqrt(sum/(x.length-1));
		return std;
	}
	
}
