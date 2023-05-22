
public class formatexample {
public static void main(String[] args) {
	String str1 = String.format("%d" , 101); // Integer 
	String str2 = String.format("%b", 10); //returns true if non null
	String str3 = String.format("%c", 'a'); // unicode character value
String str4 = String.format("%d", 1210); //integer 
	String str5 = String.format("%e", 13.31); // returns decimal number with scientific value 
	String str6 = String.format("%g", 14.444); //floating point
	String str7 = String.format("%h", 15); //HEX string of value
	String str8 = String.format("%n", 16); //line separator
	String str9 = String.format("%o", 1); //return octal number
    String str10 = String.format("%s", "Pooja"); //string value
	String str12 = String.format("%x", 101); //hex string
	
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	System.out.println(str7);
	System.out.println(str8);
	System.out.println(str9);
	System.out.println(str10);
	System.out.println(str12);
	
}
}
