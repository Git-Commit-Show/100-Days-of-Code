public class SearchAMatrix2D {
    public static void main(String[] args) {
        int[][] matrix = {
                            {1,3,5,7},
                            {10,11,16,20},
                            {23,30,34,60}
                         };
        int target = 15;
        System.out.println(searchMatrix(matrix, target));
    }
    //https://leetcode.com/problems/search-a-2d-matrix/
    //https://leetcode.com/problems/search-a-2d-matrix-ii/
    public static boolean searchMatrix(int[][] matrix, int target) {
            int r=0;
            int c=matrix[0].length-1;
            if(matrix.length==1 && matrix[0].length==1 && target==matrix[0][0]){
                return true;
            }
            while(r<matrix.length && c>=0){
                if(matrix[r][c]==target){
                    return true;
                }
                else if(matrix[r][c]<target){
                    r++;
                }
                else{
                    c--;
                }
            }
            return false;
    }
}
