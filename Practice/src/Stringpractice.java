import java.util.*;
public class Stringpractice {
 public static void main(String[] args) {
	 String S1 = "Pooja Sharma New Intern Joinee";
	 char string[]=S1.toCharArray();
	 char[] ch = {'a', 'e' , 'i' , 'o' , 'u'};
	 int count=0;
	 int counta=0;
	 int counte=0;
	 int counti=0;
	 int counto=0;
	 int countu=0;
	 for(int i =0 ; i < string.length; i++) {
		char S2 = string[i];
		if (S2 == 'a') {
			counta++;
		}
		if (S2 == 'e') {
			counte++;
		}
		if (S2 == 'i') {
			counti++;
		}
		if (S2 == 'o') {
			counto++;
		}
		if (S2 == 'u') {
			countu++;
		}
		
		  }
	 System.out.println("count of vowel a is " + counta );
	 System.out.println("count of vowel e is " + counte );
	 System.out.println("count of vowel i is " + counti );
	 System.out.println("count of vowel o is " + counto );
	 System.out.println("count of vowel u is " + countu );

	 }
 
}



