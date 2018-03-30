/**
 * @author Jacob Nartey
 * 2. Find a value in an Array
 */

import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {
		//Integer Array of 10
		int[] intArray = new int[10];
		int[] collectElements = new int[10];
		
		Scanner reader = new Scanner(System.in);
		
		//Adding elements to array
		intArray[0] = 2;
		intArray[1] = 3;
		intArray[2] = 10;
		intArray[3] = 12;
		intArray[4] = 24;
		intArray[5] = 5;
		intArray[6] = 8;
		intArray[7] = 5;
		intArray[8] = 2;
		intArray[9] = 10;
		
		//Initial array index
		int index = 0;
		int value = 0;
		int arrayPos = 0;
		
		//Print first array intArray
		System.out.print("intArray = {");
		
		//Loop to iterate array intArray
		for(int a : intArray) {
			System.out.print(a);
			
			if(index != intArray.length - 1) {
				System.out.print(", ");
			}
			
			//Increment counter
			index++;
		}
		System.out.print("}");
		
		System.out.println("\n");
		
		System.out.println("Enter value you would like you to search for");
		System.out.print("> ");
		value = reader.nextInt();
		
		int checkPos = 0;
		
		for(int arrayValue : intArray) {
			if(value == arrayValue) {
				System.out.println("Array value: " + arrayValue + " found at position: " + arrayPos);
				collectElements[arrayPos] = arrayValue;
				checkPos++;
			}
			
			arrayPos++;
		}
		
		//Condition to check if collectElements array is empty 
		if(checkPos == 0) {
			System.out.println("Value not found in Array!");
		}
		
		reader.close();
	}

}
