import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf {
	String name;
	int age;
	public Dwarf(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean isSameName(String name) {
	    this.name = name;
	    return true;
	}
}


class starter {
	public static void main(String args[]) {
		Dwarf[] x = new Dwarf[100];
		Random rand = new Random();
		int actualName;
		int actualAge;
		String[] possibleName = new String[7];
		possibleName[0] = "Grumpy";
		possibleName[1] = "Dopey";
		possibleName[2] = "Doc";
		possibleName[3] = "Happy";
		possibleName[4] = "Bashful";
		possibleName[5] = "Sneezy";
		possibleName[6] = "Sleepy";
		for (int i = 0; i < 100; i++) {
			actualName = rand.nextInt(7);
			actualAge = rand.nextInt(100)+1;
			x[i] = new Dwarf(possibleName[actualName], actualAge);
		}
		String firstValue = x[0].name;
		for (int j = 0; j < 100; j++) {
			System.out.println(x[j].name + ": Age " + x[j].age);
		}
		int duplicates = 0;
		for (int k = 0; k < 100; k++) {
	        if ((x[k].name).equals(firstValue)) {
	        	duplicates++;
	        }
	        else {
	        }
	    }
		System.out.println("First name was " + x[0].name + " and there were " + duplicates + " duplicates.");
	}
}