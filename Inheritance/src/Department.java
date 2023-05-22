class Department extends  Compensation implements Company
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