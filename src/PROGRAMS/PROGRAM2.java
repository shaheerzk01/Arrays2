package PROGRAMS;

import java.util.Scanner;

public class PROGRAM2 {
	
	static int[][] Array(int[][] arr1, int m , int n) {
		
		int[][] arr2 = new int[m][n];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr1[i][j];
			}	
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to display matrix\nPress 2 to display sum of each element in a matrix\nPress 3 to show row wise sum\nPress 4 to show column wise sum\nPress 5 to display transpose of matrix");
		int number;
		number = input.nextInt();
		if(number==1) {
			System.out.println("---------- Display of matrix ----------");
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		if(number==2) {
			System.out.println("---------- Sum of matrix ----------");
			int sum=0;
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					sum += arr2[i][j]; 
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Sum of all elements in the given matrix is " + sum);
		}
		
		if(number==3) {
			System.out.println("---------- Sum of row wise matrix ----------");
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
			for(int i=0; i<arr2.length; i++) {
				int sum=0;
				for(int j=0; j<arr2[i].length; j++) {
					sum += arr2[i][j]; 
				}
				System.out.println("The Sum " + (i + 1) + " row is " + sum);
			}
			
		}
		
		if(number==4) {
			System.out.println("---------- Sum of column wise matrix ----------");
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
			for(int i=0; i<arr2.length; i++) {
				int sum=0;
				for(int j=0; j<arr2[i].length; j++) {
					sum += arr2[j][i]; 
				}
				System.out.println("The Sum " + (i + 1) + " column is " + sum);
			}
		}
		if(number==5) {
			System.out.println("---------- Transpose of matrix ----------");
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[j][i] + " ");
				}
				System.out.println();
			}
		}
		return arr2;
		
		
	}

	public static void main(String[] args) {
		int A = 3;
		int B = 3;
		int[][] C = {{1,2,3},
				{4,3,5},
				{8,2,9}};
		Array(C, A, B);
		
		}


}
