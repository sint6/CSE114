import java.util.Scanner;

public class Lab24Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary: ");
        String s = input.nextLine();
        int dec = bin2dec(s);
        System.out.println("Decimal: " + dec);
        input.close();
    }
    
    public static int bin2dec(String binaryString) throws NumberFormatException
    {
        int decimal = 0;
        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) 
        {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
            {
                throw new NumberFormatException("The string is not a binary string");
            }
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		return decimal;
    }
}