public class EmpType implements Emp
{
public int Emp_id;
public String Emp_Name;
public String Emp_Desg;


public EmpType()
{
Emp_id=52629;
Emp_Name="Pooja Sharma";
Emp_Desg="Intern Consulting";
}
public EmpType(int Id,String Name,String Desg)
{
	this.Emp_id=Id;
	this.Emp_Name=Name;
	this.Emp_Desg=Desg;
}
public void getId()
{
	System.out.println("Emp id="+Emp_id);
}

public void getName()
{
	System.out.println("Emp name="+Emp_Name);
}

public void getDesignation() 
{
	System.out.println("Emp Designation="+Emp_Desg);
}
}
