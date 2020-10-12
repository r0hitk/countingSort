package countingSorting;

import java.util.Scanner;

public class Executor {
static int[] array;
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array to sort:");

		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();

		array = new int[arraySize];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		int b[] = CountingSort.sort(array,10);

		System.out.println("The Sorted array is: ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		scan.close();


	}

}
