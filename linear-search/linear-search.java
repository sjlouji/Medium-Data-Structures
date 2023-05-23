class LinearSearch {
	
	public static int linearSearch(int inputList[], int searchElement) {
		int position = -1;
		for (int i = 0; i < inputList.length; i += 1) {
			int _itr = inputList[i];
			if (_itr == searchElement) {
				position = i;
				break;
			}
		}
		return position;
	}

	public static void main(String args[]) {
		int inputList[] = { 1,3,2,6,5,4,9,8,7 };
		int searchElement = 6;
		int position = LinearSearch.linearSearch(inputList, searchElement);

		if (position != -1) {
			System.out.println("Search Element found at position: "+ (position + 1));
		} else {
			System.out.println("Search Element not found");

		}
	}
}