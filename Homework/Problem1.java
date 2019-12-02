// Sint Kaung
// 112776130

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("integerFile.txt");
            FileWriter fw = new FileWriter(file, false);
            PrintWriter pw = new PrintWriter(fw);
            for (int i=0;i<100;i++)
            {
                pw.print((int)(Math.random()*101) + " ");
            }
            
            pw.flush();
            pw.close();

            ArrayList<Integer> list = new ArrayList<>();

            Scanner input = new Scanner(file);
            while (input.hasNextInt())
            {
                list.add(input.nextInt());
            }

            Collections.sort(list);
            System.out.println("Sorted numbers from file: ");
            for (int i=0;i<list.size();i++)
                System.out.print(list.get(i) + " ");
            input.close();
        }
        catch (IOException ioe)
        {}
    }
}