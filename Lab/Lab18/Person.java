package Lab18;

public class Person
{
    private String name;
    private String address;
    private String phoneNum;
    private String email;

    public Person()
    {
        name = "unknown";
        address = "unknown";
        phoneNum = "unknown";
        email = "unknown";
    }
    public Person(String nam, String add, String num, String em)
    {
        name = nam;
        address = add;
        phoneNum = num;
        email = em;
    }

	public void setName(String nam) 
    {
		name = nam;
    }
    public String getName() 
    {
		return name;
    }
    public void setAddress(String add) 
    {
		address = add;
    }
    public String getAddress() 
    {
		return address;
	}
    public void setPhoneNum(String num) 
    {
		phoneNum = num;
    }
    public String getPhoneNum() 
    {
		return phoneNum;
    }
	public void setEmail(String em) 
    {
		email = em;
    }
    public String getEmail() 
    {
		return email;
	}  
    public String toString() 
    {
        return "\nName: " + name + 
                "\nAddress: " + address + 
                "\nPhone number: " + phoneNum + 
                "\nEmail address: " + email;
    }
}
