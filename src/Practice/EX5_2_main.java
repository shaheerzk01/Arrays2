package Practice;

import java.util.Arrays;

public class EX5_2_main {
	
	public static void main(String[] args) {
		//input array   
		int[] myArray = {43, 54, 23, 65, 78, 85, 88, 92, 10};
		System.out.println("Input Array: " + Arrays.toString(myArray));
		
		//create object of class which has method to find maximum
		
		EX5_2 obj = new EX5_2();
		//pass input array to find_max method that returns maximum element
		System.out.println("Maximum value in the given array is::" + obj.find_max(myArray));
	}

}
