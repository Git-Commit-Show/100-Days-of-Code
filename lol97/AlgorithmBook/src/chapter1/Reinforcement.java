package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reinforcement {
	private static void printMenu() {
		System.out.println("==========================");
		System.out.println("1. R.1.1 InputAllBaseType");
		System.out.println("==========================");
	}
	
	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		printMenu();
//		System.out.println("Please choose menu : ");
//		while(!stdIn.hasNextInt()) {
//			stdIn.hasNextLine();
//			System.out.println("Invalid integer; please enter an integer: ");
//		}
//		int menu = stdIn.nextInt();
//		stdIn.close();
//		runMenu(menu);
		inputAllBaseTypes();
	}
	
	private static void runMenu(int menu) {
		switch (menu) {
		case 1:
			inputAllBaseTypes();
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
		input.close();
	}

}
