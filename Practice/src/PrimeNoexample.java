
public class PrimeNoexample {
public static void main (String [] args) {
	int arr [] = { 2 , 3 , 5 , 6, 7, 7 , 6 , 3 , 8 , 9 , 10 , 0 };
	System.out.println("Prime numbers are :");
	for(int i = 0 ; i < arr.length; i++) {
		boolean isprime = true;
		for(int j = 2 ; j<arr[i] ; j++) {
			if(arr[i] % j ==0) {
				isprime = false;
				break;
			}
		}
		
		if(isprime) {
			System.out.println(" " + arr[i]);
		}
		
	}
}
}
