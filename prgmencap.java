class encap
{
	private int SSN;
	private String Name;
	private int Salary;
	public int getSSN()
	{
		return(SSN);
	}
	public void setSSN(int SSN)
	{
		this.SSN=SSN;
	}
	public String getName()
	{
		return(Name);
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public int getSalary()
	{
		return(Salary);
	}
}
class prgmencap 
{
	public static void main(String args[])
	{
		encap E1=new encap();
		E1.setSSN(52);
		E1.setName("Vathsa");
		E1.setSalary(80000);
		System.out.println("SSN= "+E1.getSSN());
		System.out.println("Name= "+E1.getName());
		System.out.println("Salary= "+E1.getSalary());
	}
}

	
