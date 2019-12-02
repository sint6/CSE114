//Sint Kaung
//112776130

import java.util.Scanner;

public class Hw1q4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = input.nextLine();
		int x = 0; //x is counter for uppercase letters
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isUpperCase(s.charAt(i)))
				x++;
		}
		System.out.println("The number of uppercase letters is " + x);
		input.close();
	}

}