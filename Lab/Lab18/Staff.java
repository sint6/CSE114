package Lab18;

public class Staff extends Employee 
{
	private String title;

    public Staff(String nam, String add, String num, String em, String off, double sal, int exp, String titl) 
    {
		super(nam, add, num, em, off, sal, exp);
		title = titl;
	}

    public String getTitle() 
    {
		return title;
	}

    public void setTitle(String titl) 
    {
		title = titl;
	}

    public String toString() 
    {
        return super.toString() + 
                "\nTitle: " + title;
	}
}