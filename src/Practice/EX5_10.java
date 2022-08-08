package Practice;

public class EX5_10 {
	
	    //binary search
        static int binarySearch(int arr[], int low, int high, int key) {
		
		if(high<low) {
			return -1;
		}
		
		/*low + (high -low)/2;*/
		int mid = (low + high)/2;
		if(key==arr[mid]) {
			return mid;
		}
		if(key > arr[mid]) {
			return binarySearch(arr, (mid + 1), high, key);
		}
		return binarySearch(arr, low, (mid-1), key);
	}
    
    /* Function to delete an element */
    static int deleteElement(int arr[], int n , int key) {
    		
    	// Find position of element to be
    	// deleted
    	int pos = binarySearch(arr, 0, n-1, key);
    		
    	if  (pos==-1) {
   			System.out.println("Element not found");
    			return n;
   		}
    		
   		//deleting element
   		for(int i=pos; i<n-1 ; i++) {
    		arr[i] = arr[i+1];
    	}
    	return n - 1;
    	}
    
    /* Driver Code*/
	public static void main(String[] args) {
		int i;
		int arr[] = {10, 50, 30, 40, 20};
		
		int n = arr.length;
		int key = 30;
		
		System.out.println("Array before deletion");
		for(i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		n = deleteElement(arr, n , key);
		System.out.println("\n\nArray after deletion");
		for(i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}


}
