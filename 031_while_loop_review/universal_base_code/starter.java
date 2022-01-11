import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int count = 0;
		Random rand = new Random();
		while(true)
		{
		System.out.println(rand.nextInt(100)+1);
		count++;
		if(count == 100)
		{
		break;
		}
		} 


		
	}
}
