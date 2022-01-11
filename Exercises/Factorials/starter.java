import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// The for loop one
		Scanner sc = new Scanner(System.in);
		int i,fact=1;  
		System.out.println("Input an integer.");
		int number=sc.nextInt();  
		for(i=1;i<=number;i++){    
    	fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

