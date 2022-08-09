
public class Employee {

	public static void main(String[] args)
	{
		Department obj = new Department();
		obj.AEM(); 
		
		obj.JAVA();
		
		obj.PHP();
        
	}

}

interface company{
	String Comp_name="PRFT Inc";
}

abstract class Abstract
{
	abstract void Intern();
	abstract void Associate_Consultant();
	abstract void Technical_Consultant();
}


  class Designation extends Abstract 
  {
	  void Intern()
	  {
		  System.out.println("Designation is Intern");
	  }
	  void Associate_Consultant()
	  {
		  System.out.println("Designation is Associate Technical Consultant");
	  }
	  void Technical_Consultant()
	  {
		  System.out.println("Designation is Technical Consultatnt");
	  }
	  
	  
  }
  
  
  
  class Compensation extends Designation
  {
	  void InternComp(int p)
	  {
		  super.Intern();
		  System.out.println("Compensation is "+p);
	  }
	  void AssociateComp(int q)
	  {
		  super.Associate_Consultant();
		  System.out.println("Compensation is "+q);
	
	  }
	  void TechnicalComp(int r)
	  {
		  super.Technical_Consultant();
		  System.out.println("Compensation is "+r);
	  }
  }
  
  
  
  class Department extends  Compensation implements company
  {
	  void AEM()
	  {
		  System.out.println(Comp_name);
		  super.InternComp(20000);
		  System.out.println("Department is AEM");
		  System.out.println();
	  }
	  void JAVA()
	  {
		  System.out.println(Comp_name);
		  super.AssociateComp(25000);
		  System.out.println("Department is JAVA"); 
		  System.out.println();
	  }
	  void PHP()
	  {
		  System.out.println(Comp_name);
		  super.TechnicalComp(30000);
		  System.out.println("Department is PHP");
		  System.out.println();
	  }
	  
  }