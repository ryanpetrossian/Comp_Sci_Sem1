import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class starter {
	public static void toStringArray(int[] num) {
		Random rand = new Random();
		int c = 0;
		while(c < num.length)
		{
		num[c] = rand.nextInt(100)+1;
		System.out.print(num[c] + " ");
		c++;
		}
		return;
	}
	
	public static int getArrayAverage(int[] num) {
		int c = 0;
		int sum = 0;
		while(c < num.length) 
		{
            sum += num[c];
            c++;
        }
        int average = sum / num.length;
        return average;
	}
	
	public static int getArrayMin(int[] num) {
		int c = 0;
		int min = 1000;
		while(c < num.length)
		{
		if(num[c] < min)
		{
		min = num[c];
		}
		c++;
		}
		return min;
	}
	
	public static int getArrayMax(int[] num) {
		int c = 0;
		int max = 0;
		while(c < num.length)
		{
		if(num[c] > max)
		{
		max = num[c];
		}
		c++;
		}
		return max;
	}
	
	public static void main(String args[]) {
		int[] num = new int[100];
		
		toStringArray(num);
		getArrayAverage(num);
		getArrayMax(num);
		getArrayMin(num);


		
	}
}
