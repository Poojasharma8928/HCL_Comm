
class Pallindrome {
	
	public static void main(String[] args) {
		
		String str= "ABBA";
		char ch;
		String empty="";
		
		
		for(int i=0;i<str.length();i++) 
		{
			
			ch=str.charAt(i);
					
			empty=ch+empty;
			
		}
		
//		for(int i = 0;i<str.length();i++) {
//			if (str.charAt(i)==empty.charAt(i)) {
//				continue;
//			}
//			else {
//				System.out.println("Not a Palindrome");
//			}
//		}
//		System.out.println("Palindrome");
//		
//		
		System.out.println(empty+" "+str );
		if (str.equals(empty)){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("error");
		}
		
		
		
	}
				
	
}
