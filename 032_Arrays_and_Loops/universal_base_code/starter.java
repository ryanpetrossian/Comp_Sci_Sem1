import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
    	int[] arnold = new int[1000];
    	int count = 0;
    	while (count < arnold.length) 
    	{
	        arnold[count] = rand.nextInt();
	        System.out.println(arnold[count++]); 
    	}
   }
}
	
