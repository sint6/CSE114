import java.io.*;
import java.util.Scanner;

public class Lab24Q1
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first file to be compared: ");
        String f1 = input.nextLine();

        System.out.print("Enter second file to be compared: ");
        String f2 = input.nextLine();

        try 
        {
            BufferedReader br1 =  new BufferedReader(new FileReader(f1));
            BufferedReader br2 =  new BufferedReader(new FileReader(f2));
            String s1 = br1.readLine();
            String s2 = br2.readLine();
            int differentLines=0;
            while (s1 != null || s2 != null)
            {
                if (!s1.equalsIgnoreCase(s2))
                {
                    differentLines++;
                }
                s1 = br1.readLine();
                s2 = br2.readLine();
            }
    
            if (differentLines == 0)
            {
                System.out.println("Files are identical.");
            }
            else
            {
                System.out.println("Files are not identical at " + differentLines + " lines.");
            }
            input.close();
            br1.close();
            br2.close();
        } 
        catch (FileNotFoundException fnfe) 
        {
            System.out.println("File not found");
        }
    }
}