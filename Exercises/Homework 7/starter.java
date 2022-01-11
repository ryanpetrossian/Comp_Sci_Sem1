import java.util.Scanner;
import java.util.Random;

class dog {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	String name;
	int age;
	String breed;
	
	public dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public dog(String a, String c) {
		name = a;
		age = 1;
		breed = c;
	}
	public dog(String a, int b) {
		name = a;
		age = b;
		breed = "dog dog";
	}
	
	public void setName() {
		System.out.println("What is your dog's name?");
		name = sc.nextLine();
		return;
	}
	public void setAge() {
		System.out.println("How old is your dog?");
		age = sc.nextInt();
		return;
	}
	public void setBreed() {
		System.out.println("What breed is your dog?");
		breed = sc.nextLine();
		return;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	public boolean isSleeping() {
		boolean isSleeping;
		int num = rand.nextInt(2)+1;
		if (num == 1) 
		{
			isSleeping = true;
		}
		else if (num == 2)
		{
			isSleeping = false;
		}
		return isSleeping;
	}
	public void bark() {
		System.out.println(name + " barks!");
		return;
	}
	
}

class starter {
	public static void main(String args[]) {
		dog x = new dog();
		dog y = new dog();
		int hasBarked = 0;
		x.setName();
		x.setAge();
		y.setName();
		y.setBreed();
		
		x.isSleeping();
		if (true)
		{
			System.out.println(x.name + " is sleeping...");
		}
		else if (false)
		{
			x.bark();
			hasBarked++;
		}
		
		y.isSleeping();
		if (true && hasBarked >= 1)
		{
			y.bark();
			System.out.println(x.name + " just woke up " + y.name + "!");
		}
		else if (false && hasBarked >= 1)
		{
			y.bark();
		}
		else
		{
			System.out.println("Peace remains throughout the doghouse...");
		}
	}
}
