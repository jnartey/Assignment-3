/**
 * @author Jacob Nartey
 * 5. Comma seperated values
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class CommaSeparated {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = "";
		//String index starting at 0
		int stringIndex = 0;
		
		//String position counter
		int stringPos = 0;
		
		//Prompt user to enter comma separated string
		System.out.println("Input multiple words seperated by commas (,)");
		System.out.print("> ");
		words = input.nextLine();
		
		//Removing all white spaces from text
		words = words.replaceAll("\\s", "");
		StringTokenizer commaSeparated = new StringTokenizer(words, ",");
		
		//Creating string array with size of comma separated string
		String[] strArray = new String[commaSeparated.countTokens()];
		
		//Storing tokenized string into array
		while (commaSeparated.hasMoreElements()) {
			strArray[stringIndex] =  commaSeparated.nextToken();;
			//Incrementing string index
			stringIndex++;
		}
		
		//Printing string array
		for(String word : strArray) {
			
			//Printing words and position
			System.out.println(word + " found at position " + stringPos);
			
			//Incrementing string position counter
			stringPos++;
		}
		
		input.close();
	}
}
