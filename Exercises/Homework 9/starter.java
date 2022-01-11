import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] num = new int[20];
		int i = 0;
    	while (i < num.length) 
    	{
        num[i] = rand.nextInt(50)+1;
        i++;
    	}
    	
        System.out.println("Original array: ");  
        int count = 0;
        while (count < num.length) 
        {  
            System.out.print(num[count] + " ");  
            count++;
        }  
        
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        count = num.length-1;
        while (count >= 0) 
        { 
            System.out.print(num[count] + " ");  
            count--;
        }  
        
	}
}
