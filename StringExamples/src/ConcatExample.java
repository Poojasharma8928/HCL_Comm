import java.util.*;

public class ConcatExample {

	public static void main(String[] args) {
		String str = "Pooja" + " Sharma";
		System.out.println("str: "+str);
		
		String str1 = 10 + 10  + " ABC " + 5 + 5;
		System.out.println(str1);
		
		//Concatenation method
		String str2 = "Pooja";
		String str3 = " Sharma";
		System.out.println(str2.concat(str3));
		
		//Substring
		System.out.println(str3.substring(0,2));
		System.out.println(str2.substring(0 , 5));
		
		// Substring using Split function
		String text = new String("Hello , My name is - Pooja");
		String[] mysentence = text.split("\\-");
		System.out.println(Arrays.toString(mysentence));
		System.out.println("-------------");
		
		//String methods
		
		System.out.println(str2.toUpperCase());
		System.out.println("-------------");
		System.out.println(str2.toLowerCase());
		System.out.println("-------------");
		
		String S = " HCL commerce";
		System.out.println(S.trim());
		System.out.println("-------------");
		System.out.println(S.startsWith(" "));
		System.out.println("-------------");
		System.out.println(S.startsWith("HC"));
		System.out.println("-------------");
		System.out.println(S.endsWith("ce"));
		System.out.println("-------------");
		System.out.println(S.charAt(1));
		
		System.out.println(S.indexOf('a'));
		System.out.println("-------------");
		System.out.println(S.length());
		System.out.println("-------------");
		System.out.println(S.isEmpty());
		System.out.println("-------------");
		
		String obj = new String ("Pooja is good girl");
		
		String obj2 = obj.intern();  //initially empty then store value of another variable
		
		System.out.println(obj2);
		
		int a = 10;
		
		String obj3 = String.valueOf(a);
		System.out.println("-------------");
		System.out.println( 10 + obj3);
		System.out.println("-------------");
		String s1 = "Python is important language";
		String replacestring = s1.replace("Python", "Java");
		System.out.println(replacestring);
		System.out.println("-------------");
		System.out.println(s1.contains("Python"));	
		System.out.println("-------------");
		System.out.println(s1.contains("python"));  //case sensitive
		
		if(s1.contains(null)) {
			System.out.println("if block is true");
		}
		else {
			System.out.println("else block is true");
		}
		
		String p1 = null;
		if(p1.isEmpty()) {
			System.out.println("String is empty");  //isEmpty not applicable on null
		}
		else {
			System.out.println("Not null");
		}
		
	}
}
