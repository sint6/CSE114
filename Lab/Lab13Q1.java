import java.util.Scanner;

public class Lab13Q1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] array = new double[rows][columns];
		System.out.println("Enter the array:");
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++) 
				array[i][j] = input.nextDouble();
		int[] location = locateLargest(array);
		System.out.println("The location of the largest element is at (" 
		+ location[0] + "," + location[1] + ")");
		input.close();
		
	

	}
	public static int[] locateLargest(double[][] a) 
	{
		int[] location = new int[2];
	    double largestEle = a[0][0];
	    for (int i = 0; i < a.length; i++) 
	    {
	    	for (int j = 0; j < a[i].length; j++) 
	    	{ 
	    		if (largestEle < a[i][j]) 
	    		{
	    			largestEle = a[i][j];
	                location[0] = i;
	                location[1] = j;
	            }
	        }
	    }
	    return location;
	}
}
