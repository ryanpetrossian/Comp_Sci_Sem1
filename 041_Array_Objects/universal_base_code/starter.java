import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Warrior[] x = new Warrior[100];
		Wizard[] y = new Wizard[100];
		for (int i = 0; i < 100; i++)
		{
			x[i] = new Warrior();
			y[i] = new Wizard();
		}
		int j = 0;
		int k = 0;
		while (y[j].isDead() == false && x[k].isDead() == false)
		{
			y[j].attack(x[k]);
			j++;
			x[k].attack(y[j]);
			k++;
		}
		if (x[k].isDead() == true)
		{
			System.out.println("There is 1 wizard remaining!");
		}
		else if (y[j].isDead() == true)
		{
			System.out.println("There is 1 warrior remanining!");
		}

	
	}
}
