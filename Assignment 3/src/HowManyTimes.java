import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 4. How many times
 */
public class HowManyTimes {

	public static void main(String[] args) {
		//Integer Array of 10
		int[] intArray = new int[10];
		
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
		
		//Print array intArray
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
		//Prompt and take user's input
		System.out.println("Enter value you would like you to search for");
		System.out.print("> ");
		value = reader.nextInt();
		
		//Value counter
		int valueCounter = 0;
		
		for(int arrayValue : intArray) {
			if(value == arrayValue) {
				//Incrementing value counter if it found in the array
				valueCounter++;
			}
		}
		
		//Print the number of times user's input appears in array
		if(valueCounter == 1) {
			System.out.println("Value " + value + " appears onces in array");
		}else if(valueCounter > 1) {
			System.out.println("Value " + value + " appears " + valueCounter + " times in array");
		}else {
			System.out.println("Value " + value + " does not exist in array");
		}
		
		reader.close();
	}

}
