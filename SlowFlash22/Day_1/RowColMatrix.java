import java.util.Arrays;
//works only when every next element is greater than previous, row-wise and column-wise
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,26, 35, 45},
                {28, 29, 37, 49},
                {33,34,38,50}
        };
        System.out.println("Found at: "+ Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] matrix, int target){
        int r=0;
        int c= matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            /*
              v v v v
              - - - -<Attack
              - - - -<Attack
              - - x -<Attack
              - - - -<Attack
            * */
            if(matrix[r][c]<target){//moves to next row to check it's equivalent element, this row's last element is smaller than target
                r++;
            }
            else{//checks if we're in greater region, if true then searching in last column gets cancelled
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
