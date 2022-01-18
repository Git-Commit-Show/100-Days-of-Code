import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListManipulation{
	public List<Integer> getUniqueOnly(List<Integer> listNum){
		List<Integer> uniqeuData = new ArrayList();
		for(int num: listNum){
			int counter = 0;
			for(int numCompare: listNum){
				if(num == numCompare){
					counter+=1;
				}
			}
			if(counter<2){
				uniqeuData.add(num);
			}
		}
		return uniqeuData;
	}

	public static void main(String[] args) {
		ListManipulation lm = new ListManipulation();
		System.out.println(lm.getUniqueOnly(new ArrayList<Integer>( Arrays.asList(1, 2, 3, 1, 2))));
	}

}