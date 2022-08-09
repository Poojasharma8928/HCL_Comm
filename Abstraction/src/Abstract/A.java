class A extends Marks{

	String Std_Name;
   int Marks1, Marks2, Marks3;

   public A( String Name , int M1, int M2, int M3){

	   Std_Name = Name;
       Marks1=M1;

       Marks2=M2;

       Marks3=M3;

   }
   
   	public float getPercentage() {
   		
   		
   		System.out.println("Result for Student " +Std_Name);

        float total=((Marks1+Marks2+Marks3)/(float)300)*100;

        return total;
	}
   
}