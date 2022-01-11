import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name.");
		String fullname = sc.nextLine();
		String lastname = fullname.substring(fullname.lastIndexOf(" ") + 1);
		System.out.println(lastname);
	}
}
