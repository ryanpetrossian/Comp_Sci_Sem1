import pkg.*;
import java.util.Scanner;
import java.util.Random;


class modeMedian {
	public int getMode(int[] x) {
		if (math.mode(x)) {
			modeValue = math.mode(x);
			return modeValue;
		}
		else {
			return -1;
		}
	}
	
	public int getMedian(int[] x) {
		medianValue = math.median(x);
		return medianValue;
	}
	
	public static void main(String args[]) {
		int[] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};
		int[] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int[] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);
		int mode2 = getMode(arr2);
		int mode3 = getMode(arr3);
		
		int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);
		int median2 = getMedian(arr5);
	}
}
