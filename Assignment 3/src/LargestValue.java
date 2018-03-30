/**
 * @author Jacob Nartey
 * 3. Largest Value
 *
 */
public class LargestValue {
	
	public static void main(String[] args) {
		//Integer Array of 10
		int[] intArray = new int[10];
				
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
		int maxPos = 0;
		
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
		
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > intArray[maxPos]) {
				maxPos = i;
			}
		}
		
		System.out.println("Maximum value: " + intArray[maxPos] + " at position " + maxPos);
		 
	}

}
