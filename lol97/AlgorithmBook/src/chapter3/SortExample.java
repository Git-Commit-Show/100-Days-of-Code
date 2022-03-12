package chapter3;


public class SortExample {
	public static void insertionSort(char[] data) {
		int length = data.length;
		char[] dataBefore = new char[length];
		System.arraycopy(data, 0, dataBefore, 0, length);
		for (int i = 1; i < length; i++) {
			char current = data[i];
			int j = i;
			while (j > 0 && data[j - 1] > current) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = current;
		}
		System.out.println("before : " + String.valueOf(dataBefore));
		System.out.println("after : " + String.valueOf(data));
	}

	public static void main(String[] args) {
		insertionSort("bcdaehgf".toCharArray());
	}
}
