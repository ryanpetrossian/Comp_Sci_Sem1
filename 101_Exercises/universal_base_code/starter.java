import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii w = new Ascii("Human");
		Ascii x = new Ascii("Human","Bob");
		Ascii y = new Ascii("Human","Bob",1);
		Ascii z = new Ascii("Other");
		
		String type = "Other";
		String name = "Smiley Face";
		int number = 1;
		String oneLine = ":)";
		
		z.setType(type);
		z.setName(name);
		z.setNumber(number);
		z.setAscii(oneLine);
		z.printArt();
		
		


		
	}
}
