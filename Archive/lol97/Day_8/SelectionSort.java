public class SelectionSort{
	public int[] sort(int[] arr){
		int length = arr.length;

		
		for (int i=0; i<length-1;i++){
			int idxPointer = i;
			
			for(int j=i+1; j<length;j++){
				if(arr[j] < arr[idxPointer]){
					idxPointer = j;
				}
			}
			//swap data
			int tempData = arr[idxPointer];
			arr[idxPointer] = arr[i];
			arr[i] = tempData;
		}


		return arr;
	}

	public void printArray(int[] array){
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		SelectionSort selSort = new SelectionSort();
		int[] exampleData = new int[]{2, 4, 1, 6, 5, 3, 7, 8};
		selSort.printArray(exampleData);
		int[] res = selSort.sort(exampleData);
		selSort.printArray(res);
	}
}