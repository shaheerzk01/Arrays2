package PROGRAMS;

public class PROGRAM3 {
	
	static int[][] Array(int[][] arr1, int[][] arr2){
		
		//mask
		System.out.println("Orignal Mask\n");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("Horizontally flipped Mask\n");
		//flipping the mask horizontally
		int[][] C =new int [3][3];
		for(int i=0; i<arr1.length; i++) {
			for(int j=arr1[i].length-1; j>=0; j--) {
				C[i][j] = arr1[i][arr1.length-1-j];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("Vertically flipped Mask\n");
		//flipping the mask vertically
		int[][] E =new int [3][3];
		for(int i=C.length-1; i>=0; i--) {
			for(int j=0; j<C[i].length; j++) {
				E[i][j] = C[arr1.length-1-i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		//padding of matrix
		int[][] d =new int[arr2.length+2][arr2.length+2];
		for(int i=0; i<E.length; i++) {
			for(int j=0; j<E[i].length; j++) {
				d[i+1][j+1] = E[i][j];
			}
		}
		System.out.println("\nPadded matrix\n");
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		int sum=0;
		int[][] f = new int[3][3];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				f[i][j]=(arr2[i][j]*d[i][j]);
				sum +=f[i][j];
				arr2[0][0] = sum;
			}
		}
		
		System.out.println("\nConvolution of first index\n");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " " );
			}
			System.out.println();
		}
		
		return arr1;
	}

	public static void main(String[] args) {
		int[][] A = {{1,2,3,},
				{4,5,6},
				{7,8,9}};
		int[][] B = {{2,4,6},
				{8,10,12},
				{14,16,18}};
		Array(A,B);
		}

	}


