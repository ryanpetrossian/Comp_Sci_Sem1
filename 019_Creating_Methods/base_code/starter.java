import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static String toString(String x) {
		String a = x;
		String sentence = x;
		System.out.println(" ");
		System.out.println("This is using the methods!");
		System.out.println(sentence);
		return "";
	}
	
	public static String toStringCombined(String x, String y) {
		String a = x;
		String b = y;
		String combined = x + " " + y;
		System.out.println(combined);
		return "";
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String a = sc.nextLine();
		System.out.println("Write another sentence.");
		String b = sc.nextLine();
		
		toString(a);
		toStringCombined(a,b);
	
		
	}

		
}
