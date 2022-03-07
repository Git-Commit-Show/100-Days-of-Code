package chapter2.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MakeChange {
	public static final List<Long> moneytaryRupiah = new ArrayList<Long>(Arrays.asList(100L, 200L, 500L, 1000L, 2000L, 5000L, 10000L, 20000L, 50000L, 100000L));
	
	public static HashMap<Long, Long> doChange(Long payment, Long charged){
		HashMap<Long, Long> ret = new HashMap<Long, Long>();
		long resmoney = payment - charged;
		System.out.println("resmoney : " + resmoney);
		long leastValue = moneytaryRupiah.get(0);
		for (int i=moneytaryRupiah.size()-1; i >= 0; i--) {
			if (resmoney < leastValue) {
				break;
			}
			long temp = moneytaryRupiah.get(i);
			if (temp <= resmoney) {
				long total = resmoney / temp;
				resmoney = resmoney - temp * total;
				ret.put(temp, total);
			}
		}
		ret.put(resmoney, resmoney);
		return ret;
	}
	
//	public static HashMap<Long, Integer> closeMoney(Long resmoney, List<Long> moneytary){
//		HashMap<Long, Integer> ret = new HashMap<Long, Integer>();
//		for (int i=ret.size(); i < 0; i++) {
//			if (moneytary.get(0) >= resmoney) {
//				ret.put(moneytary.get(0), )
//			}
//		}
//	} 
	
	public static void main(String[] args) {
		Long payment = 100001L;
		Long charged = 8000L;
		HashMap<Long, Long> retChange = doChange(payment, charged);
		System.out.println(retChange);
	}
}
