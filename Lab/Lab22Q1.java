import java.util.*;

public class Lab22Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1=0;
        int n2=0;
        boolean loop=true;
        do
        {
            try
            {
                System.out.print("Enter two integers to be added: ");
                n1 = input.nextInt();
                n2 = input.nextInt();
                loop = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.print("Invalid input. ");
                input.nextLine();
            }
        }
        while (loop);

        int sum = n1+n2;
        System.out.println("Sum: " + sum);
        input.close();
    }
}