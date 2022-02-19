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
		System.out.println("4. R.1.4 isEven");
		System.out.println("5. R.1.5 sumUntil");
		System.out.println("6. R.1.6 sumOddUntil");
		System.out.println("7. R.1.7 sumSquareUntil");
		System.out.println("8. R.1.8 countVowel");
		System.out.println("9. R.1.9 removePunctuation");
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
		Scanner input = new Scanner(System.in).useDelimiter("\n");;
		int numberInput;
		String strInput;
		switch (menu) {
		case 1:
			inputAllBaseTypes();
			break;
		case 2:
			listGameEntry();
			break;
		case 3:
			System.out.println("value m : ");
			long m = input.nextLong();
			System.out.println("value n : ");
			long n = input.nextLong();
			System.out.println("is n Multiple of m : " + isMultiple(m, n));
			break;
		case 4:
			System.out.println("check number value : ");
			int number = input.nextInt();
			System.out.printf("is number %d : %B %n", number, isEvenNumber(number));
			break;
		case 5:
			System.out.println("sum until : ");
			int until = input.nextInt();
			System.out.printf("total sum until %d is %d %n", until, sumUntil(until));
			break;
		case 6:
			System.out.println("sum odd until : ");
			int untilOdd = input.nextInt();
			System.out.printf("total sum odd until %d is %d %n", untilOdd, sumOddUntil(untilOdd));
			break;
		case 7:
			System.out.println("sum odd until : ");
			numberInput = input.nextInt();
			System.out.printf("total sum square until %d is %d %n", numberInput, sumSquareUntil(numberInput));
			break;
		case 8:
			System.out.println("count vowel of text : ");
			strInput = input.next();
			System.out.printf("total vowel of text %s is %d %n", strInput, countVowel(strInput));
			break;
		case 9:
			System.out.println("text : ");
			strInput = input.next();
			System.out.printf("before %s after %s %n", strInput, removePunctuation(strInput));
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
	
	private static boolean isEvenNumber(int number) {
		while(number>-2) {
			number -= 2;
			if (number == 0) {
				return true;
			} else if (number == -1) {
				return false;
			}
		}
		return false;
	}
	
	private static int sumUntil(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	
	private static int sumOddUntil(int n) {
		int sum = 0;
		for(int i=1; i<=n; i+=2) {
			sum += i;
		}
		return sum;
	}
	
	private static int sumSquareUntil(int n) {
		if (n == 1) {
			return 1;
		} else if (n < 1) {
			return n;
		}
		int sum = 0;
		for(int i=2; i<=n; i = i*i) {
			sum += i;
		}
		return sum;
	}
	
	private static int countVowel(String text) {
		int sumVowel = 0;
		String lowerText = text.toLowerCase();
		for(int i=0; i < text.length(); i++) {
			char c = lowerText.charAt(i);
			if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
				sumVowel++;
			}
		}
		return sumVowel;
	}
	
	private static String removePunctuation(String text) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c != '\'') {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}

class GameEntry{
	int score;
}
