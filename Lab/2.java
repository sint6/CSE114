import java.io.*;
import java.util.Scanner;

public class Lab24Q1class
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first file to be compared: ");
        String f1 = input.nextLine();

        System.out.print("Enter second file to be compared: ");
        String f2 = input.nextLine();

        FilesIdentical fi = new FilesIdentical(f1, f2);

        System.out.println("Files are identical: " + fi.isIdentical());
        System.out.println(fi.getDifferentLines() + " lines are different.");
    }
}