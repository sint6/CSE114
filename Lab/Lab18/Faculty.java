package Lab18;

public class Faculty extends Employee 
{
	private String officeHours;
	private String rank;

	public Faculty(String nam, String add, String num, String em, String off, double sal, int exp, String officeH, String ran) {
		super(nam, add, num, em, off, sal, exp);
		officeHours = officeH;
		rank = ran;
    }
    
    public void setOfficeHours(String officeH) 
    {
		officeHours = officeH;
	}
    public String getOfficeHours() 
    {
		return officeHours;
    }
    
    public void setRank(String ran) 
    {
		rank = ran;
    }
    public String getRank() 
    {
		return rank;
    }
    
	public String toString() {
        return super.toString() + 
                "\nOffice hours: " + officeHours +
		        "\nRank: " + rank;
	}
}