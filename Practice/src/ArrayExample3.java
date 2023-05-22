
public class ArrayExample3 {
	 	public static void main(String[] args) {
	 		int[] arr = {2,4,5,3,4,5,6,7,7,7,35,35,35,23,22,24,24,24};
	 		int [] A= new int[10];
	 		int index = 0;
	 		for (int i=0; i<arr.length;i++)
	 		{ 
	 			int flag = 0;
	 			for (int j=0; j< i ; j++)
	 			{
	 				if(arr[i]== arr[j]) {
	 					flag = 1;
	 					break;
	 				}
	 			}
	 			if(flag==0) {
	 				A[index] = arr[i];
	 				index++;
	 			}
	 		}
	 		for (int i=0; i< index; i++)
	 		{
	 			System.out.print(" " + A[i]);
	 		}
	 		System.out.println();
	 		System.out.println(A.length);
	 		System.out.println(index);
	 		for (int i=0; i< A.length; i++)
	 		{ 
	 			int count = 0;
	 			for(int j=0; j< arr.length;j++) 
	 			{ 
	 				if(A[i] == arr[j]) {
	 					count++;
	 				}
	 			}
	 			System.out.println("Count of " +A[i] +" is " + count);
	 		}
	 		
	 	}
	}
