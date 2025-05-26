class ArrayDemo {
	public static void main(String[] args) {
		
		// type, sqare bracket, variable name
		// initailization or decalaration
		int [] intArr2 = {1,2,3,4,5}; // l 5, index 0 4

		// arary declaration
		int [] intArr;

		// initailization
		// intArr = {1,2,3,4,5}; // non-scence
		intArr = new int[]{1,2,3,4,5};

		// declaration
		String [] strArr = new String[5]; // length 5, index 0-4

		// insert into array
		strArr[0] = "AA";
		strArr[1] = "BB";
		strArr[4] = "DD";
		//strArr[6] = "EE"; // ArrayIndexOutOfBoundException

		System.out.println("Value : index 1 => " + strArr[1]); // BB
		System.out.println("Value : index 3 => " + strArr[3]); // null
		//System.out.println("Value : index 5 => " + strArr[5]); // ArrayIndexOutOfBoundException

		for(String st: strArr) {
			System.out.print(st + " ");
		}
	}
}
