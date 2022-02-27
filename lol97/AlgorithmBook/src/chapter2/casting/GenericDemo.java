package chapter2.casting;

public class GenericDemo {
	public static <T> void reverse(T[] data) {
		int low = 0, high = data.length-1;
		while(low < high) {
			T temp = data[low];
			data[low++] = data[high];
			data[high--] = temp;
		} 
	}
}

/*
 * 1. Give three examples of life-critical software applications. 
 * 	1. ISO 26262, IEC 62304, IEC 61513 
 * 2. Give an example of a software application where adaptability can mean the difference between a prolonged sales lifetime and bankruptcy. 
 * 	2. Microsoft Office 
 * */