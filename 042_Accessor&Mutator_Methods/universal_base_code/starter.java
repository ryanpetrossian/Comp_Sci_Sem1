import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf {
	String name;
	int age;
	public Dwarf() {
		
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
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
			x[i] = new Dwarf();
			actualName = rand.nextInt(7);
			x[i].setName(possibleName[actualName]);
			actualAge = rand.nextInt(100)+1;
			x[i].setAge(actualAge);
		}
		for (int j = 0; j < 100; j++) {
			System.out.println(x[j].name + ": Age " + x[j].age);
		}
		
		
	}
}
