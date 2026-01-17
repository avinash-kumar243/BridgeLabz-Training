/* Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order.
Given an array arr[], with starting index low and ending index high, complete the functions partition() and quickSort().
Use the last element as the pivot, so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.

Note: low and high are inclusive.
*/

import java.util.Scanner;
import java.util.Arrays;
class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            // valid for quick sort
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        
        for(int j=low; j<high; j++) {
            if(arr[j] < arr[high]) {
                // Swap (i+1)th and jth element
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Shift last element to its
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = {5, 2, 8, 6, 12, 15, 14, 9, 25, 20};
		
		quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
}