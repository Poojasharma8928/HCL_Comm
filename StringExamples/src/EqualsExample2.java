
public class EqualsExample2 {
public static void main(String [] argsvs) {
	String Str = "a";
	String Str1 = "123";
	String Str2 = "11.99";
	String Str3 = "Pooja";
	String Str4 = Str1.toString();
	String Str5 = "Pooja";
	
	String Str6 = new String("Pooja");
	
	
	
	System.out.println(Str2.equals(Str4));
	System.out.println(Str1.equals(Str4));
	System.out.println(Str3 == Str5);
	System.out.println(Str5 == Str6);  // Str6 creating new instance belonging to non pool
	System.out.println(Str3.compareTo(Str5));
	System.out.println(Str.compareTo(Str3));
	System.out.println(Str3.compareTo(Str)); //17 times less
}
}
