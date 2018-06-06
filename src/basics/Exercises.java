package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally got this set up with github
		biggestDifference();
	}
	public static void biggestDifference(){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter size of Array:");
		int arraySize = reader.nextInt();
		reader.nextLine();
		int[] arrayProcessed = new int[arraySize];
		
		System.out.println("Enter elements of array:");
		String arrayRaw = reader.nextLine();
		String[] arrayCheck = arrayRaw.split(" ");
		
		System.out.println(Arrays.toString(arrayProcessed));
		System.out.println(arraySize);
		System.out.println(Arrays.toString(arrayCheck));
	}
}
