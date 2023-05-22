
public class stringpractice1 {
public static void main(String[] args) {
	String S1 = "Pooja Sharma is New Intern Joinee";
	char[] ch = {'a' , 'e' , 'i' , 'o' , 'u'};
	for(int j = 0 ; j < ch.length; j++) {
		int count = 0;
	for(int i = 0;  i < S1.length(); i++) {
			if(S1.charAt(i) == ch[j]) {     
				count++;
			}
		
	}
	System.out.println("count of "+ ch[j]+ " is " + count);
//	System.out.println("Vowel is " + count);
	}
	}
}
