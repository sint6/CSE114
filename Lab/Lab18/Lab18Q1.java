package Lab18;

import java.util.Scanner;

public class Lab18Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Is the triangle filled? true/false: ");
        Boolean filled = input.nextBoolean();

        Triangle tri = new Triangle(s1,s2,s3);
        tri.setColor(color);
        tri.setFilled(filled);

        System.out.println("Area of the triangle: " + tri.getArea());
        System.out.println("Perimeter of the triangle: " + tri.getPerimeter());
        System.out.println("Color of the triangle: " + tri.getColor());
        System.out.println("Triangle is filled? : " + tri.isFilled());

        input.close();
    }
}