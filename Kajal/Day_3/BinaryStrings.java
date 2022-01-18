// Generate all binary Strings upto size n

public class BinaryStrings {

    public static void main(String[] args) {
        int n = 3;
        generateAllBinaryStrings(n);
    }

    // main function given in ques
    public static void generateAllBinaryStrings(int n){
        int[] arr = new int[n];
         helper(n,arr,0);
         printArray(n,arr);
    }

    // function to print array output
    private static void printArray(int n, int[] arr) {
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    // function to generate binary strings
    public static void helper(int size, int[] arr, int index){
        // base condition
        if(size == index){
            printArray(size, arr);
            return;
        }
        // we are making combinations so first index can be 0 or 1
        // assign 0 to first index
        arr[index] = 0;
        helper(size, arr, index+1);

        // assign 1 to first index
        arr[index] = 1;
        helper(size, arr, index+1);
    }
}
