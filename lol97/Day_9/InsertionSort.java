public class InsertionSort{
	public int[] sort(int[] data){
		for(int i=1; i < data.length; i++){
			int key = data[i];
			int j = i -1;

			while(j >=0 && key < data[j]){
				data[j+1] = data[j];
				j = j-1;
			}
			data[j+1] = key;
		}
		return data;
	}

	public void printArray(int[] data){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		InsertionSort insSort = new InsertionSort();
		int[] exampleData = new int[]{2, 4, 1, 6, 5, 3, 7, 8};
		insSort.printArray(insSort.sort(exampleData));
	}
}