//Sint Kaung
//112776130

import java.util.Scanner;

public class H2Q1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String s = input.nextLine();
		String sRev = "";
		String s2 = s.toLowerCase();
		s2 = s.replaceAll("\\s","");
		for (int i=s2.length()-1;i>=0;i--)
			sRev += s2.charAt(i);
		if (sRev.equals(s2))
			System.out.println("Input string " + s + " is a palindrome");
		else
			System.out.println("Input string " + s + " is not a palindrome");
		input.close();	
	}
}
