class Empmain extends EmpType
{

public static void main(String[] args)
{
	
	EmpType Emp1=new EmpType();
	
	System.out.println("Data From Default Constructer\n");
	Emp1.getName();
	Emp1.getId();
	Emp1.getDesignation();
	System.out.println("___________________________________");

EmpType Emp2=new EmpType(52628,"Janvi Sharma","Associate Consultant");
{
	System.out.println("\nData From parameterized constructor\n");
	Emp2.getName();
	Emp2.getId();
	Emp2.getDesignation();
	System.out.println("___________________________________");
}
Empmain Emp3=new Empmain();

	System.out.println("\nData From Main class\n");
	Emp3.getName();
	Emp3.getId();
	Emp3.getDesignation();
}
	
public void getId()
{
	System.out.println("Employee id 52627");
}
public void getName()
{
	System.out.println("Employee name is Riya Sharma");

}
public void getDesignation()
{
	System.out.println("Employee Designation is Technical Consultant");
}

}
