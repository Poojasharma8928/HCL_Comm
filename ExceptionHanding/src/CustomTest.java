import java.util.Scanner;
public class CustomTest extends ExceptionHandler {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		do {
			System.out.println("Please Enter Your password: ");
			String password1 = sc.next();
  
        try {
            System.out.println("Is your Password "
                               + password1 + " valid?");
            isValid(password1);
            System.out.println("Valid Password");
            
            break;
        }
        catch (InvalidPassword e) {
        	System.out.println(i+" Failure attempt ");
//System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
			
			i++;
		}while(i<=3);
		
		sc.close();
	}
	
}

