import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		
		//input array elements
		inputArray(arr);
		
		//display the Array
		System.out.println("array elements: ");
		displayArray(arr);
		
		//calculate and display sum of elements
		int sum = calculateSum(arr);
		System.out.println("Sum of array elements: " + sum);
		
		//find and display max element
		int max = findMax(arr);
		System.out.println("Maximum elements: " + max);
		
		//find and display min element
	    int min= findMin(arr);
		System.out.println("Maximum elements: " + min);

		//calculate and display average of elements
		double avg = calculateAverage(arr);
		System.out.println("Average of array elements: " + avg);
		
		//search for an element in array
		System.out.println("Enter an element to search for ");
		int searchElement = sc.nextInt();
		boolean found = searchElement(arr, searchElement);
		
		if(found) {
			System.out.println(searchElement + " is found in array");
		}else {
			System.out.print(searchElement + " isn't found in array");
		}
	}
		//method to input array of elements
		public static void inputArray (int [] arr) {
			Scanner sc= new Scanner (System.in);
			System.out.println("enter array elements");
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
	
		}
		//method to display array of elements
				public static void displayArray (int [] arr) {
					for (int i = 0 ; i < arr.length; i++) {
						System.out.println(arr[i]+ " ");
					}
					System.out.println();
			
	      }
	  //Calculate Sum method
				public  static int calculateSum(int[]arr) {
					int sum = 0; 
					for (int i = 0 ; i < arr.length; i++) {
						sum+= arr[i];
					}
					return sum;
				}
				
				public static int findMax(int[]arr) {
					int max = arr[0];
					for(int i = 0; i < arr.length; i++) {
						if (arr[i] > max) {
							max = arr[i];
						}
					}
					return max;
				}
				public static int findMin(int[]arr) {
					int min = arr[0];
					for(int i = 0; i < arr.length; i++) {
						if (arr[i] < min) {
							min = arr[i];
						}
					}
					return min;
				}
	//Calculate average of elements
				public static double calculateAverage(int []arr) {
				int sum = calculateSum(arr);
				return (double) sum/ arr.length;
				}

	//Search for an element in array 
	public static boolean searchElement(int [] arr, int target) {
		for (int i = 0; i <arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}
}

