
public class Practice {

public static void main(String[] args) {
	
	int a = 5 ;
	int b = 3;
	int c;
	
//	c = a + b;
	
//	System.out.println(c);
	
	operation(5 , 2 , "+");
	operation(5 , 2 , "-");
	
	
	
	Operation(10 , 2 , "+");
	Operation(10 , 2 , "-");
}

public static void operation( int A , int B , String Operator) {
	switch(Operator) {
	case "+":{
		System.out.println("Addition is " + (A+B));
		break;
	}
	case "-":{
		System.out.println("Substraction is" + (A-B));
		break;
	}
	
	
		
	}
}

public static void Operation(int P  , int Q , String Operator) {
	if(Operator == "+") {
	System.out.println("Add is " + (P+Q) );	
	}
	
	else if(Operator == "-"){
		System.out.println("Sub is "+ (P-Q));
		
	}
	
	
}


	
}

