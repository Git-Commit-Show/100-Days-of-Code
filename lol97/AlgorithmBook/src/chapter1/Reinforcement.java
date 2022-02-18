package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reinforcement {
	private static void printMenu() {
		System.out.println("==========================");
		System.out.println("1. R.1.1 InputAllBaseType");
		System.out.println("2. R.1.2 GameEntry");
		System.out.println("3. R.1.3 isMultiple");
		System.out.println("==========================");
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		printMenu();
		System.out.println("Please choose menu : ");
		while(!stdIn.hasNextInt()) {
			stdIn.hasNextLine();
			System.out.println("Invalid integer; please enter an integer: ");
		}
		int menu = stdIn.nextInt();
		runMenu(menu);
	}
	
	private static void runMenu(int menu) {
		switch (menu) {
		case 1:
			inputAllBaseTypes();
			break;
		case 2:
			listGameEntry();
			break;
		case 3:
			Scanner input = new Scanner(System.in);
			System.out.println("value m : ");
			long m = input.nextLong();
			System.out.println("value n : ");
			long n = input.nextLong();
			System.out.println("is n Multiple of m : " + isMultiple(m, n));
			break;
		default:
			System.out.println("menu not found");
			break;
		}
	}
	
	private static void inputAllBaseTypes() {
		Scanner input = new Scanner(System.in);
		System.out.println("basic types: int, short, long, char, byte, boolean, float, double : ");
		List<Object> list = new ArrayList<Object>();
		int inpInt = input.nextInt();
		short inpShort = input.nextShort();
		long inpLong = input.nextLong();
		char inpChar = input.next().charAt(0);
		byte inpByte = input.nextByte();
		boolean inpBoolean = input.nextBoolean();
		float inpFloat = input.nextFloat();
		double inpDouble = input.nextDouble();
		
		list.add(inpInt);
		list.add(inpShort);
		list.add(inpLong);
		list.add(inpChar);
		list.add(inpByte);
		list.add(inpBoolean);
		list.add(inpFloat);
		list.add(inpDouble);
		
		System.out.println(list);
	}
	
	private static void listGameEntry() {
		GameEntry[] A = new GameEntry[5];
		A[0] = new GameEntry();
		A[1] = new GameEntry();
		A[2] = new GameEntry();
		A[3] = new GameEntry();
		A[4] = new GameEntry();
		GameEntry[] B = A;
		A[4].score = 440;
		System.out.println(B[4].score); 
	}
	
	private static boolean isMultiple(long m, long n) {
		if (m > n) {
			return false;
		} else {
			return n % m == 0;
		}
	}

}

class GameEntry{
	int score;
}
