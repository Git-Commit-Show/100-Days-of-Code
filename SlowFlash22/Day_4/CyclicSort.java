import java.util.Arrays;
//most important
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct_index = arr[i]-1;
            //if arr[0] != arr[2] => 3 != 4 =>true and swap
            if(arr[i]!=arr[correct_index]){
                swap(arr, correct_index, i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
