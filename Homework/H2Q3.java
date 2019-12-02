//Sint Kaung
//112776130

import java.util.Scanner;

public class H2Q3 
{

	public static void main(String[] args) 
	{
		String[] cities = new String[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 strings:");
		for (int i=0;i<10;i++)
			cities[i] = input.nextLine();
		String[] citiesSorted = bubbleSort(cities);
		
		System.out.println("Sorted strings:");
		for (int i=0;i<citiesSorted.length;i++)
			System.out.print(citiesSorted[i] + " ");
		input.close();
			
	}
	public static String[] bubbleSort(String[] c)
	{
		String temp;
		for (int i=0;i<c.length;i++)
			for (int j=0;j<c.length-1;j++)
			{
				if (c[j].compareToIgnoreCase(c[j+1])>0)
				{
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		return c;
	}
}
