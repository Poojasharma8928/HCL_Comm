import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayExample {
	public static void main(String[] args) {
		
	ArrayList <String> Technologies = new ArrayList<>();

	Technologies.add("Python");
	Technologies.add("Java"); 
	Technologies.add("Scala");
	Technologies.add("Pysark"); 
	Technologies.add("SQL");

	System.out.println( "ArrayList"+ Technologies );

	System.out.println(); 
	System.out.println("The values of list using for each is: ");

	//for each

	for (String language: Technologies) {

	System.out.println(language);
	}
	System.out.println(" **************************************");
			 //Iterator

	Iterator<String> Iter = Technologies.iterator();

	System.out.println("The values of iterator are :" );
	while(Iter.hasNext()) {
			System.out.println(Iter.next());
	}

	System.out.println("*****************************************");

	//ListIterator

	System.out.println("The values of ListIterator in forward direction is:"); 
	
	ListIterator <String> namesIterator = Technologies.listIterator(); 
	
	while(namesIterator.hasNext()) {

	System.out.println(namesIterator.next());
	}
	System.out.println("************************** ");
	
			System.out.println("The values of ListIterate in backword direction is");
			
	while(namesIterator.hasPrevious()) 
	{ System.out.println(namesIterator.previous());
}
}
	}