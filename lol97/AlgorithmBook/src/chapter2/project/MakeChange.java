package chapter2.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MakeChange {
	public final List<Long> moneytaryRupiah = new ArrayList<Long>(Arrays.asList(100L, 200L, 500L, 1000L, 2000L, 5000L, 10000L, 20000L, 50000L, 100000L));
	
	private List<Long> listMoneytary;
	
	public MakeChange() {
		this.listMoneytary = moneytaryRupiah;
	}
	
	public MakeChange(List<Long> listMoneytary) {
		this.listMoneytary = listMoneytary;
	}
	
	
	public HashMap<Long, Long> doChange(Long payment, Long charged){
		HashMap<Long, Long> ret = new HashMap<Long, Long>();
		long resmoney = payment - charged;
		System.out.println("resmoney : " + resmoney);
		long leastValue = listMoneytary.get(0);
		for (int i=listMoneytary.size()-1; i >= 0; i--) {
			if (resmoney < leastValue) {
				break;
			}
			long temp = listMoneytary.get(i);
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
		MakeChange change = new MakeChange();
		HashMap<Long, Long> retChange = change.doChange(payment, charged);
		System.out.println(retChange);
		
		List<Long> moneytaryDollar = new ArrayList<Long>(Arrays.asList(1L, 5L, 10L, 25L, 50L, 100L));
		MakeChange changeDolar = new MakeChange(moneytaryDollar);
		HashMap<Long, Long> retChangeDolar = changeDolar.doChange(payment, charged);
		System.out.println(retChangeDolar);
	}
}
