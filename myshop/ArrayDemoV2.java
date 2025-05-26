class ArrayDemoV2 {
	public static void main(String[] args) {
		String [] st = {"AA", "BB", "CC", "DD", "EE"};

		for(String s : st) {
			System.out.println(s + " ");
		}

		st[2] = "cc";
		System.out.println(st[2]);

		for(String s : st) {
			System.out.println(s + " ");
		}

		String [] newArr = new String[st.length + 1]; // 6, 0 - 5

		// String newElement = "ZZ";

		for(int i = 0; i<st.length; i++) {
			newArr[i] = st[i];
		}
	}

}




/* 
Note
=====
static void show(String ... names) {}
*/
