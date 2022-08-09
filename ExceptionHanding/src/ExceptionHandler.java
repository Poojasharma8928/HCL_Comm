
public class ExceptionHandler {
	
		
		public static void isValid(String password)
		        throws InvalidPassword
		    {
		  
		        if (!((password.length() >= 8)
		              && (password.length() <= 15))) {
		            throw new InvalidPassword(1);
		        }
		  
		  
		        if (password.contains(" ")) {
		            throw new InvalidPassword(2);
		        }
		        if (true) {
		            int count = 0;
		  

		            for (int i = 0; i <= 9; i++) {
		  
		                String str1 = Integer.toString(i);
		  
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		                throw new InvalidPassword(3);
		            }
		        }
		        if (!(password.contains("@") || password.contains("#")
		              || password.contains("!") || password.contains("~")
		              || password.contains("$") || password.contains("%")
		              || password.contains("^") || password.contains("&")
		              || password.contains("*") || password.contains("(")
		              || password.contains(")") || password.contains("-")
		              || password.contains("+") || password.contains("/")
		              || password.contains(":") || password.contains(".")
		              || password.contains(", ") || password.contains("<")
		              || password.contains(">") || password.contains("?")
		              || password.contains("|"))) {
		            throw new InvalidPassword(4);
		        }
		  
		        if (true) {
		            int count = 0;
		  
		            for (int i = 65; i <= 90; i++) {
		  
		                char c = (char)i;
		  
		                String str1 = Character.toString(c);
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		                throw new InvalidPassword(5);
		            }
		        }
		  
		        if (true) {
		            int count = 0;
		  
		            
		            for (int i = 97; i <= 122; i++) {
		  
		                
		                char c = (char)i;
		                String str1 = Character.toString(c);
		  
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		                throw new InvalidPassword(6);
		            }
		        }
		  

		    }
	}

