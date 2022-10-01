import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            // for each step, max item will come at their respective last index
            // what if it doesn't? We're using swapped boolean variable!
            swapped = false;
            for(int j=1; j<=arr.length-1-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if did not bring any of the numbers to last index, then it is certain that the array is already sorted
            if(!swapped){
                break;
            }
        }
    }
}
