import java.util.Scanner;
import java.util.Random;

class starter {
    
    // My method for finding an index in an int array
    
    public static int findIndex(int arr[], int a)
    {
        int length = arr.length;
        int i = 0;
        while (i < length) 
        {
            if (arr[i] == a) 
            {
                return i;
            }
            else 
            {
                i = i + 1;
            }
        }
        return -1;
    }
    
    // A method to count duplicates
    
    public static int countDuplicates(int arr[], int j, int target) {
        int count = 0;
        for (int i = 0; i < j; i++)
            {
            if (target == arr[i])
                {
                    count++;
                }
            }
        return count;
    }
    
    // A method to find how many consecutive numbers and another method to return the value of one of them
    
    public static int countConsecutives(int arr[], int j) {
        int consecutiveoccurance = 0;
        for (int i = 0; i < j - 1; i++)
        {
            if (arr[i] == arr[i + 1])
                consecutiveoccurance++;
        }
        return consecutiveoccurance;
}

    public static int identifyConsecutives(int arr[], int j) {
        int consecutivevalue = 0;
        for (int i = 0; i < j - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            consecutivevalue = arr[i];
        }
        return consecutivevalue;
}
    
	public static void main(String args[]) {
	    
	// Generating array of 20 elements
	
		Random rand = new Random();
    	int[] arr = new int[20];
    	for (int i = 0; i < arr.length; i++) 
    	{
            arr[i] = rand.nextInt(10)+1; 
            System.out.print(arr[i] + " ");
    	}
    	
    // Calling method to count duplicates of random target number
    
    	System.out.println();
    	System.out.println();
        int target = rand.nextInt(10)+1;
        int j = arr.length;
        System.out.println("Target number: " + target);
        System.out.println("There are " + (countDuplicates(arr, j, target)) + " duplicates of the target.");
        
    // Printing out the indexes of duplicate numbers
    
        int k = 0;
        int l = 0;
        while (k < arr.length)
        {   
            int initialvariable = l;
            while (l < arr.length)
            {    
                if (target == arr[l] && l > k && l != initialvariable)
                {
                    System.out.println("Duplicate for " + target + " in index " + l);
                    break;
                }
                l++;
            }   
            k++;
        }
        
    // Calling method to check for consecutive numbers, print out the values of one of the occurances, and give the indexes of the values in that occurance
    
        System.out.println();
        j = arr.length;
        System.out.println("There are " + (countConsecutives(arr, j)) + " occurances of consecutive numbers in this array.");
        System.out.println("One of the occurances is of the value " + (identifyConsecutives(arr, j)));
        System.out.println("This occurance is at indexes " + (findIndex(arr, (identifyConsecutives(arr, j)))) + " and " + ((findIndex(arr, (identifyConsecutives(arr, j)))) + 1));
    }
}
