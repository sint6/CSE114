import java.io.*;
import java.util.Scanner;

public class Lab23Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file of scores: ");
        File file = new File(input.nextLine());
        if (file.exists())
        {
            int num = 0;
            double total = 0;
            try
            {
                Scanner f = new Scanner(file);  
                while (f.hasNext())
                {
                    num++;
                    total += f.nextInt();
                }
                f.close();
            }
            catch (IOException ioe)
            {}

		    System.out.println("Total scores: " + total);
		    System.out.println("Average scores: " + (total / num));
        }
        else
            System.out.print("File " + file + " does not exist");
        input.close();
    }
}