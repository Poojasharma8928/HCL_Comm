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