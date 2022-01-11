import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int arraySize = rand.nextInt(200)+51;
		int[] num = new int[arraySize];
		int min = 1000;
		int max = 0;
		int sum = 0;
		int c = 0;
		while(c < num.length)
		{
		num[c] = rand.nextInt(100)+1;
		System.out.print(num[c] + " ");
		c++;
		}
		
		// Minimum
		c = 0;
		System.out.println();
		while(c < num.length)
		{
		if(num[c] < min)
		{
		min = num[c];
		}
		c++;
		}
		System.out.println();
		System.out.print("The minimum is: " + min);
		
		// Maximum
		c = 0;
		System.out.println();
		while(c < num.length)
		{
		if(num[c] > max)
		{
		max = num[c];
		}
		c++;
		}
		System.out.println();
		System.out.print("The maximum is: " + max);
		
		// Average
		c = 0;
		System.out.println();
		while(c < num.length) 
		{
            sum += num[c];
            c++;
        }
        int average = sum / num.length;
         
        System.out.println();
        System.out.println("The average is : " + average);
        
        // Print out number of elements
        System.out.println();
        System.out.println("There are " + num.length + " integers in this array.");


		
	}
}
