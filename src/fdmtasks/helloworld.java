package fdmtasks;

import java.util.*;

public class helloworld {
	
	public static int[] reverseorderBubble(int[] array) {
		//TODO descending order 
		for (int outer=0; outer<array.length-1; outer++) {
			for(int inner=0; inner<array.length-1-outer; inner++) {
				if (array[inner] < array[inner +1]) {
					int temporary_num = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temporary_num;
				}
			}
		}
		return array;
	}
	
	public static int[] Bubblesort(int[] array, int size) {		
		//TODO Add Time Complexity analysis with Big O
		
		for (int i=0; i<size-1; i++) {                                   //........ n
			System.out.println("iter"+ i);								//......... n
			for (int j=0; j<size-1-i;j++) {								//......... n * n
				if (array[j] > array[j+1]) {							//......... n * n
					int temporary_num = array[j];
					array[j] = array[j+1];
					array[j+1] = temporary_num;
				}
			}
		}
		return array;
	}
	
	public static int [] even(int[] array, int size) {
		// TODO check array for even numbers using modulus
		for (int i = 0; i<size; i++) {
			if (array[i]%2==0) {
				System.out.println(array[i] + " Even number found");
			}
		}
		return array;
	}
	
	public static int search(int[] array, int target) {
		int location = 0;
		for (int i = 0; i<array.length;i++) {
			if (array[i] == target) {
				location = i;
				
			}
		}
		return location;
	}
	
	public static int binarysearch(int[] array, int target) {
		//TODO add binary search to fdm task
		int end = array.length-1;
		int begin = 0;
		if(end>=begin) {
			int midpoint = (end - begin)/2 + begin;
			if (array[midpoint] == target) {
				return midpoint;
			}
			if (array[midpoint] > target) {
//				return binarySearch(array,)
			}
		}
		
		return 0;
	}
	
	public static int number_pairs(int [] array) {
		//TODO find number pairs in array
		int result_num = 0;
//		int [][] result_2dim = new int [array.length][];
		
		for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (first == second) {
                	result_num += 1;
//                	result_2dim[i][j] = j;
                	}
                }
            }
		
		return result_num;
	}
	
	public static String foreach(int[] array) { //trying out for loops
		for (int num : array) {
			// TODO add methods
			System.out.println(num);
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		double price;
		int result;
		
		
		Scanner number_array = new Scanner(System.in);
		System.out.println("Size of Array");
		size=number_array.nextInt();
		
		int[] numbers = new int[size];
		
		for (int i=0;i<size;i++)
		{
			System.out.println("Input numbers, " + (i+1));
			numbers[i] = number_array.nextInt();
				
		}
		
		

		
		System.out.println("Sort Completed... Ascending Order Sorted List: " + Arrays.toString(Bubblesort(numbers, size)));
		System.out.println("Sort Completed... Descending Order Sorted List:" + Arrays.toString(reverseorderBubble(numbers)));
//		even(numbers, size);
		int number_to_find =23;
		System.out.println("Find Pairs ofnumbers ..." + number_pairs(numbers));
		System.out.println("Linear Search Completed, Number " + number_to_find + " found at index :" + search(numbers, number_to_find) + " For most recent sorted list");
	
	}

}
