import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String wordReverse(String a) {
    int i = a.length() - 1;
    int start = i + 1;
    int end = i + 1;
    String result = "";
     
    while(i >= 0)
    {
        if(a.charAt(i) == ' ')
        {
        	start = i + 1;
            while(start != end)
                result += a.charAt(start++);
            	result += ' ';
            	end = i;
        }
        i--;
    }
    
    start = 0;
    while(start != end)
    	{
        result += a.charAt(start++);
    	}
    return result;
}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Write a sentence.");
    String a = sc.nextLine();
     
    System.out.print(wordReverse(a));
	}
}
