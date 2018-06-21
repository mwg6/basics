package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally got this set up with github
		String[] a = {"a","a","b","a"};
		stripDuplicates(a);
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
	public static void allSquares(float max){
		//this method will print all squares numbers less than the max value
		float i = 1;
		if(max>0){
			while(i*i <=max){
				System.out.println(i*i);
				i++;
			}
			
		}
		else{
			System.out.println("No squares are below 0");
		}
	}
	public static void breakArray(String[] text){
				
		for(String item:text){
			System.out.println(item);
			
		}
		
	}
	public static void isPalindromic(String[] text){
				
		boolean isPalindromic = true;
		//too minimize number of calculations, only compare to half +1 at most cases
		for(int i = 0; i<(text.length/2)+1; i++){
			if(text[i]!=text[text.length-(1+i)]){
				isPalindromic = false;
			}
		}
		System.out.println(isPalindromic);
	}
	
	public static void stripDuplicates(String[] text){
		String hold=text[0];
		System.out.println(hold);
		
		for(String item:text){
			if(item!=hold){
				System.out.println(item);
				hold = item;
			}
		}
	}
	
	
}
