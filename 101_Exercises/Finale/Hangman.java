import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	public Hangman() {
		generateWord();
		tries = 5;
	}
	public Hangman(int x) {
		generateWord();
		tries = x;
	}

	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}
	
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
		for (int i = 0, i < letter.length, i++) {
			if (letter.equals(guessingWord.substring(i))) {
				start = indexOf(guessingWord.substring(i));
				break;
			}
			else {
				continue;
			}
			return -1;
		}
		return start;
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		if (guessedWord == true) {
			return true;
		}
		else {
			return false;
		}
	}
}

