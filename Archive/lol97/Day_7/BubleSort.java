import java.util.Arrays;
import java.util.List;

public class BubleSort {
	public BubleSort() {

	}

	public int[] doBubleSort(int[] unsortedData) {
		int temp;
		int length = unsortedData.length;
		for (int i=0; i < length - 1; i++) {
			for (int j=0; j < length-i-1; j++ ) {
				if (unsortedData[j] > unsortedData[j+1]) {
					temp = unsortedData[j];
					unsortedData[j] = unsortedData[j+1];
					unsortedData[j+1] = temp;
				}
			}
		}
		return unsortedData;
	}

	// public List<Integer> doBubleSort(List<int> unsortedData) {
	// 	int temp;
		
	// }

	public static void main(String[] args) {

		int data[] = {1, 4, 2, 5, 8};
		BubleSort bs = new BubleSort();
		
		System.out.println(Arrays.toString(bs.doBubleSort(data)));

		// List<Integer> dataList = Arrays.asList(1, 4, 2, 5, 8);
	}
}