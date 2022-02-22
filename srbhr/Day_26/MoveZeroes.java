import java.util.Collection;
import java.util.Collections;

/*  // This Moves Zeroes in the end but distorts the array!
*       int i=0;
        int k = nums.length-1;
        while (k>i){
              if (nums[i] == 0){
                  int temp = nums[i];
                  nums[i] = nums[k];
                  nums[k] = temp;
                  k--;
              }
            i++;
        }
*/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]!=0){
                nums[zeroIndex] = nums[i];
                zeroIndex++;
            }
        }
        while (zeroIndex < nums.length){
                nums[zeroIndex] = 0;
                zeroIndex++;
        }
    }
}

