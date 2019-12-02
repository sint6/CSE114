import java.util.*;

public class Lab22Q2
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[100];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*101);
        }
        Scanner input = new Scanner(System.in);
        int index=0;
        boolean loop=true;
        do
        {
            try
            {
                System.out.print("Enter an index of the array: ");
                index = input.nextInt();
                System.out.println("Integer at index " + index + " is " + arr[index]);
                loop = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.print("Invalid input. ");
                input.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException obe)
            {
                System.out.print("Out of bounds. ");
                input.nextLine();
            }
        }
        while (loop);

        input.close();
    }
}