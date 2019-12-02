package Lab18;

public class Employee extends Person
{
    private String office;
	private double salary;
	private int experience;

	public Employee(String nam, String add, String num, String em, String off, double sal, int exp) 
    {
		super(nam, add, num, em);
		office = off;
		salary = sal;
		experience = exp;
	}

	public void setOffice(String off) 
    {
		office = off;
	}
	public String getOffice() {
		return office;
	}

    public void setSalary(double sal) 
    {
		salary = sal;
	}
	public double getSalary() {
		return salary;
	}

    public void setExperience(int exp)
    {
        experience = exp;
    }
    public int getExperience() 
    {
		return experience;
    }
    
	public String toString() {
        return super.toString() + 
                "\nOffice: " + office + 
                "\nSalary: $" + getSalary() + 
                "\nDate hired: " + getExperience();
	}
}
