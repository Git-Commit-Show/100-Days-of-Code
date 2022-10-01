import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> uniques = new HashSet<>();
        for (int e:nums){
            if (uniques.contains(e)) return true;
            uniques.add(e);
        }
        return false;
    }
}
