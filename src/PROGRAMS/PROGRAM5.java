package PROGRAMS;

public class PROGRAM5 {
	
	static int[] Array(int[] arr1, int[] arr2, int[] arr3) {
		
		System.out.println("Welcome to the grade book");
		System.out.println("CS211DATA STRUCTURES & ALGORITHMS\n");
		System.out.println("The grades are:\n");
		
		String output = "Student|\tTest1|\t\tTest2|\t\tTest3|\t\tAverage|\n------------------------------------------------------------------------";
		
		String[] name = {"Shaheer", "Sawera", "Sooraj", "Huzaifa", "Zahir", "Nida", "Aariz", "Hassan", "Areeb", "Shazim"};
		
		int max = 0;
		int min = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			float d = ((arr1[i] + arr2[i] + arr3[i])*100)/300;
			output += "\n" + name[i]  + "\t\t" + arr1[ i ] + "\t\t" + arr2[ i ] + "\t\t" + arr3[ i ] + "\t\t" + d;
			if(max<=arr1[i]) {
				max=arr1[i];
			}
			if(max<=arr2[i]) {
				max=arr2[i];	
			}
			if(max<=arr3[i]) {
				max=arr3[i];
			}
			if(min>arr1[i] ) {
				min=arr1[i];
			}
			if(min>arr2[i]) {
				min=arr2[i];
			}
			if(min>arr3[i]) {
				min=arr3[i];
			}
	
		}
		System.out.println(output);
		System.out.println("\nHighest grade in the grade book is " + max);
		System.out.println("Lowest grade in the grade book is " + min + "\n");
		float[] Average = new float[10];
		for(int i=0; i<Average.length; i++) {
			float d = ((arr1[i] + arr2[i] + arr3[i])*100)/300;
			Average[i] = d;
		}
		int counter = 0,counter2 = 0,counter3 = 0,counter4 = 0,counter5 = 0,counter6 = 0,counter7 = 0,counter8 = 0,counter9 = 0,counter10= 0;
		int[] C = new int[10];
		for(int i=0; i<Average.length; i++) {
			if(Average[i]>=0&&Average[i]<=10) {
				counter++;
			}
			else if(Average[i]>10&&Average[i]<=20) {
				counter2++;
			}
			else if(Average[i]>20&&Average[i]<=30) {
				counter3++;
			}
			else if(Average[i]>30&&Average[i]<=40) {
				counter4++;
			}
			else if(Average[i]>40&&Average[i]<=50) {
				counter5++;
			}
			else if(Average[i]>50&&Average[i]<=60) {
				counter6++;
			}
			else if(Average[i]>60&&Average[i]<=70) {
				counter7++;
			}
			else if(Average[i]>70&&Average[i]<=80) {
				counter8++;
			}
			else if(Average[i]>80&&Average[i]<=90) {
				counter9++;
			}
			else if(Average[i]>90&&Average[i]<=100) {
				counter10++;
			}
			int[] numbers = {counter,counter2,counter3,counter4,counter5,counter6,counter7,counter8,counter9,counter10};
			for(int j =0; j<C.length; j++) {
				C[j] = numbers[j];
			}
		}
		System.out.println("Overall grade distribution:");
		int[] scores ={0,10,20,30,40,50,60,70,80,90};
		int[] scores2 = {10,19,29,39,49,59,69,79,89,100};
		String A="";
		for(int i=0;i<scores.length; i++) {
			A += "\n" + scores[i] +"-"+ scores2[i] + ":" + "\t";
			for ( int stars = 0; stars < C[ i ]; stars++ ) {
		        A += "*";
		    }
		}
		System.out.println(A);
		return arr1;
		
	}
	
	public static void main(String[] args) {
		int[] A = {86,68,94,100,83,78,85,91,76,87};
		int[] B = {96,87,100,81,65,87,75,94,72,93};
		int[] C = {70,90,90,82,85,65,83,100,84,73};
		Array(A, B, C);
	}

}
