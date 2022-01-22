import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Prime{
	public List<Integer> generateListPrime(int n){
		List<Integer> data = new ArrayList<>();
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				data.add(i);
			}
		}
		return data;
	}

	public boolean isPrime(int number){
		if(number<2){
			return false;
		} else {
			int count = 0;
			for (int i=1;i<number;i++){
				if(number%i == 0){
					count+=1;
					if(count>1){
						return false;
					}
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Prime pr = new Prime();
		System.out.println(pr.isPrime(4));
		System.out.println(pr.generateListPrime(1000));
	}
}