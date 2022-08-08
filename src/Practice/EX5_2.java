package Practice;

class EX5_2 {
	
	public int find_max(int[] myArray) {
		int max_val = 0;
		//traverse the array to compare each element with max_val
		for (int i=0; i<myArray.length; i++) {
			if(max_val<myArray[i]) {
				max_val = myArray[i];
			}
		}
		//return max_val
		return max_val;
	}
}


