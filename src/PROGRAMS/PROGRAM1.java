package PROGRAMS;

import java.util.Arrays;

public class PROGRAM1 {
	
	static int[] Array(int[] arr1, int[] arr2, int[] arr3) {
		
		int m = arr1.length;
		int n = arr2.length;
		
		arr3 = new int[m + n];
		
		int i = 0;
		for(int element: arr1) {
			arr3[i] = element;
			i++;
		}
		
		for(int element: arr2) {
			arr3[i] = element;
			i++;
		}
		
		
		System.out.println("----------Before sorting----------\n");
		for(i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		Arrays.sort(arr3);
		System.out.println("\n\n----------After sorting----------\n");
		for(i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int[] B = {10,9,8,7,6};
		int[] C = new int[A.length + B.length];
		
		 Array(A, B, C);
		
		
	}

}
