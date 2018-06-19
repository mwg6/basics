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
		
		//need to use "worst" possible starting values to insure I get correct answers
		int highest = -Integer.MAX_VALUE;
		int lowest = Integer.MAX_VALUE;
		int temp;
		
		for(int i=0;i<arrayCheck.length;i++){
			
			temp = Integer.parseInt(arrayCheck[i]);
			//two seperate if loops prevent the case where if the lowest number occurs first it will be recorded
			//as a high number then the loop is exited;
			if (temp>highest){
				highest = temp;
			}
			else{}
			if(temp<lowest){
				lowest = temp;
			}
			else{}
		}
		
		//finally, math and release of number
		if(arraySize==1){
			System.out.println("Cannot find difference in a single value");
		}
		else{
			System.out.println("The greatest difference in the input array is " + (highest-lowest));
		}
	}
}
