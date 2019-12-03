import java.util.*;
import java.io.*;

public class Lab23Q2
{
    public static void main(String[] args) throws Exception
    {
        File cities = new File("cities.txt");
        FileWriter fw = new FileWriter(cities, false);
        PrintWriter pw = new PrintWriter(fw);
        pw.print("Dallas Houston Chicago Denver Tampa Miami Charlotte Austin Detroit Seattle");
            
        pw.flush();
        pw.close();

        ArrayList<String> c = new ArrayList<>();

        Scanner fs = new Scanner(cities);
        while (fs.hasNext())
        {
            c.add(fs.next());
        }
        fs.close();
        File output = new File("output.txt");
        FileWriter fw2 = new FileWriter(output, false);
        PrintWriter pw2 = new PrintWriter(fw2);
        for (int i=c.size()-1;i>=0;i--)
        {
            pw2.print(c.get(i) + " ");
        }
            
        pw2.flush();
        pw2.close();

    }
}