import java.util.Scanner;

public class Lab9Q2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sentence to be encrypted: ");
		String s1 = input.nextLine();
		String s2 = "";
		for (int i=0;i<s1.length();i+=2)
		{
			s2 += s1.charAt(i);
			if (s2.length()==5)
				break;
		}
		System.out.println(s2);
		input.close();
	}

}
