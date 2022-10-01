public class BinarySearch{
	int search(int[] data, int l, int r, int key){
		if(r>=l){
			int mid = l + (r-l)/2;

			if(data[mid] == key) {
				return mid;
			}

			if(data[mid]>key){
				return search(data, l, mid - 1, key);
			}

			return search(data, mid + 1, r, key);
		}

		return -1;
	}

	void showResult(int result){
		if (result == -1){
			System.out.println("not found");
		} else {
			System.out.println("found at index : " + result);
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] exampleData = new int[]{2, 4, 1, 6, 5, 3, 7, 8};
		int key = 3;

		InsertionSort is = new InsertionSort();
		exampleData = is.sort(exampleData);
		int result = bs.search(exampleData, 0, exampleData.length-1, key);
		bs.showResult(result);
	}
}