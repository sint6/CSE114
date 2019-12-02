//Sint Kaung
//112776130

import java.util.Scanner;

public class Hw1q2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter : ");
		String s = input.next();
		char letter = Character.toUpperCase(s.charAt(0));
		if (Character.isLetter(letter))
		{
			switch(letter)
			{
			case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
				System.out.print(letter + " is a vowel.");
				break;
			default:
				System.out.print(letter + " is a consonant.");
			}
		}
		else
			System.out.print(letter + " is an invalid input.");
		input.close();
	}

}
