
public class EqualsExample {
public static void main(String[] args) {
	String obj1 =  "Pooja Sharma";
	String obj2 = "POOJA SHARMA";
	String obj3 = "POOJA SHARMA";
	String obj4 = "Pooja";
	System.out.println(obj1.equals(obj4));
	System.out.println(obj1.equals(obj3));
	System.out.println(obj1.equalsIgnoreCase(obj3));
	if(obj2.equals(obj3)){
		System.out.println("Both strings are equal");
		
	}
	else {
		System.out.println("Both strings are not equal");
	}

	
	
}
}
