package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SumAssignment(scanner);
		WhatIsOutput();
		ToPowerHw(scanner);
		
		scanner.close();
	}

	private static void ToPowerHw(Scanner scanner) {
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter power");
		int power = scanner.nextInt();
		double[] results =  toPower(size, power);
		System.out.println(Arrays.toString(results));
	}

	private static double[] toPower(int size, int power) {
		double[] powerArray = new double[size];
		
		for (int i=0; i<size; i++) {
			//Find the power of the number in the array at index i and change the value based on the power
			powerArray[i] = Math.pow(i, power) ;
		}
		
		return powerArray;
	}

	private static void WhatIsOutput() {
		// This will print out an error due to the typos on line 36 and line 40. 
		// Line 36 is accessing an array that is misspelled so the compiler complains that it does not exist.
		// Line 40 has an incorrect for loop declaration because the size condition has an extra greater than sign.
		// It the errors are fixed and it runs, it will print out 2 which is the index of the largest number of the Array.
		
		//		double[ ] exampleArray = {1,5,6,5,4,1};
		//
		//		double maximum = examplesArray[0];
		//
		//		int index = 0;
		//
		//		for (int i = 1; i<exampleArray.length>; i++){
		//
			//		if (exampleArray[ i ] > maximum) {
			//
			//          maximum = exampleArray[ i ];
			//
			//          index = i;
			//
			//     }
		//
		//		}
		//
		//System.out.println(index);

		
	}

	private static void SumAssignment(Scanner scanner) {		
		int total = 0;
		
		//Create an array with size of what the user entered 
		int numbers[] = new int [5];
		
		//As user is entering numbers that are being stored into the array, they are being added together
		System.out.println("Enter 5 number(s)");
		for (int i=0; i<numbers.length; i++){
			numbers[i]=scanner.nextInt();
			int number = numbers[i];
			total = total + number;
		}
		
		//Print out the sum
		System.out.println(total);
		
	}

}






