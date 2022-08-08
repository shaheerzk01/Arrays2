package PROGRAMS;

import java.util.Scanner;

public class PROGRAM_4 {
	
	static int[] Array(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
		
		String output = "Subject|\tNumbers|Histogram\n----------------------------------";
		
		
		String[] subject = {"English", "Urdu", "Maths", "Science", "ICT"};
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Press 1 for Shaheer\nPress 2 for Sawera\nPress 3 for Sooraj\nPress 4 for Nida");
		int number;
		number = input.nextInt();
		
		if(number==1) {
			System.out.println("---------- Shaheer ----------\n");
			for ( int i = 0; i < arr1.length; i++ ) {
			      output += "\n" + subject[i]  + "\t\t" + arr1[ i ] + "\t";
			      for ( int stars = 0; stars < arr1[ i ]; stars++ ) {
			        output += "*";   
			      }
			    }
			
			System.out.println(output);
			System.out.println("----------------------------------");
		}
		if(number==2) {
			System.out.println("---------- Sawera ----------\n");
			for ( int i = 0; i < arr2.length; i++ ) {
			      output += "\n" + subject[i] + "\t\t" + arr2[ i ] + "\t";
			 
			      for ( int stars = 0; stars < arr2[ i ]; stars++ ) {
			        output += "*";   
			      }
			    }
			
			System.out.println(output);
			System.out.println("----------------------------------");
		}
		if(number==3) {
			System.out.println("---------- Sooraj ----------\n");
			for ( int i = 0; i < arr3.length; i++ ) {
			      output += "\n" + subject[i] + "\t\t" + arr3[ i ] + "\t";
			 
			      for ( int stars = 0; stars < arr3[ i ]; stars++ ) {
			        output += "*";   
			      }
			    }
			
			System.out.println(output);
			System.out.println("----------------------------------");
		}
		if(number==4) {
			System.out.println("---------- Nida ----------\n");
			for ( int i = 0; i < arr4.length; i++ ) {
			      output += "\n" + subject[i] + "\t\t" + arr4[ i ] + "\t";
			 
			      for ( int stars = 0; stars < arr4[ i ]; stars++ ) {
			        output += "*";   
			      }
			    }
			
			System.out.println(output);
			System.out.println("----------------------------------");
		}
		
		
		return arr1;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {8,7,8,7,9};
		int[] arr2 = {8,8,5,5,8};
		int[] arr3 = {7,9,9,7,10};
		int[] arr4 = {7,8,7,6,9};
		Array(arr1,arr2,arr3,arr4);
	}

}
