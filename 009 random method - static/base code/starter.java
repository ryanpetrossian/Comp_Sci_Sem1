import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand_num1 = rand.nextInt(9);
		System.out.println("Random Integer: "+rand_num1);
		int rand_num2 = rand.nextInt(100);
		System.out.println("Random Integer: "+rand_num2);
		double rand_num3 = rand.nextDouble()+2.5;
		System.out.println("Random Double: "+rand_num3);
		double rand_num4 = rand.nextInt(575)+14;
		System.out.println("Random Double: "+rand_num4);
	}
}
