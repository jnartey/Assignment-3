/**
 * @author Jacob Nartey
 * 1. Copy an Array
 */
public class CopyAnArray {
	
	public static void main(String[] args) {
		//Integer Array of 10
		int[] intArrayA = new int[10];
		int[] intArrayB = new int[10];
		
		//Adding elements to array
		intArrayA[0] = 2;
		intArrayA[1] = 3;
		intArrayA[2] = 10;
		intArrayA[3] = 12;
		intArrayA[4] = 24;
		intArrayA[5] = 5;
		intArrayA[6] = 8;
		intArrayA[7] = 18;
		intArrayA[8] = 27;
		intArrayA[9] = 33;
		
		//Initial array index
		int index = 0;
		int index2 = 0;
		
		//Print first array intArrayA
		System.out.print("intArrayA = {");
		
		//Loop to iterate array intArrayA
		for(int a : intArrayA) {
			//Copying values to array intArrayB at current index 
			intArrayB[index] = a;
			
			System.out.print(a);
			
			if(index != intArrayA.length - 1) {
				System.out.print(", ");
			}
			
			//Increment counter
			index++;
		}
		System.out.print("}");
		
		System.out.println("");
		
		//Print second array intArrayB
		System.out.print("intArrayB = {");
		
		//Loop to iterate array intArrayB
		for(int b : intArrayB) {
			System.out.print(b);
			
			if(index2 != intArrayB.length - 1) {
				System.out.print(", ");
			}
			
			//Increment counter
			index2++;
		}
		
		System.out.print("}");
		
	}

}
