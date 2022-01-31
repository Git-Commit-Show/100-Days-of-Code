import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        System.out.println(Arrays.toString(search(arr, 90)));
    }
    //search in the row provided/ chosen between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            } else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//being cautious, matrix might be empty
        if(rows*cols == 0){//checking if its an empty matrix
            return new int[]{-1,-1};
        }
        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        // run the loop till required 2 rows are remaining
        while(rStart < (rEnd-1)){// if we don't put -1, then only 1 row will be found which isn't ideal
            //if it is true, then it will have more than 2 rows
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        //now we have two rows
        // check whether the target is in the column of two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        // search in 1st half
        else if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        else if(target >= matrix[rStart][cMid+1] && target<= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        // search in 3rd half
        else if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // search in 4th half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }
}
