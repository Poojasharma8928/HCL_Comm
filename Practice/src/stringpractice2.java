
public class stringpractice2 {
	public static void main(String[] args) {
	     String S1="Pooja Sharma is New Intern Joinee";
	     String[] ch= {"a","e","i","o","u"};
	     int counta=0;
	     int counte=0;
	     int counti=0;
	     int counto=0;
	     int countu = 0;

	     for (int i=0;i<S1.length();i++) {

	         if(S1.charAt(i) =='a'){
	                counta++;
	         }
	                 if(S1.charAt(i) =='e') {
	                     counte++;
	                 }

	                     if(S1.charAt(i)  == 'i') {
	                         counti++;

	                     }
	                     if(S1.charAt(i)=='o') {
	                         counto++;
	                     }

	                 if(S1.charAt(i) == 'u') {
                     countu++;

	         }
	     }
	     System.out.println("Count  is " +counta);
	     System.out.println("Count  is " +counte);
	     System.out.println("Count  is " +counti);
	     System.out.println("Count  is " +counto);
	     System.out.println("Count  is " +countu);

	     }
}
