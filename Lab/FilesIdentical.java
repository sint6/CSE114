import java.util.*;
import java.io.*;

public class FilesIdentical
{
    private int differentLines;
    private BufferedReader br1;
    private BufferedReader br2;

    public FilesIdentical()
    {
        differentLines=0;
    }
    
    public FilesIdentical(String a, String b)
    {
        br1 = new BufferedReader(new FileReader(a));
        br2 = new BufferedReader(new FileReader(b));
        differentLines=0;
    }

    public String isIdentical()
    {
        String s1 = br1.readLine();
        String s2 = br2.readLine();

        while (s1 != null || s2 != null)
        {
            if (!s1.equalsIgnoreCase(s2))
            {
                differentLines++;
            }
        }
        if (differentLines==0)
            return "True";
        else
            return "False";
    }

    public int getDifferentLines()
    {
        return differentLines;
    }
}