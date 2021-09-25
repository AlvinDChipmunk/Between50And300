package com.hubgitalvin.week2;

/**
 * Java Coding Bootclass Assignment:
 * Between 50 and 300 (no error handling)
 * version 1.00
 * 
 * In this command line program, the app asks the user to type in 
 * a number between 50 and 300.  It is expected that the input will
 * be both completely numeric and a whole number (no decimals or 
 * fractions).  If the user complies by giving a value between 50 
 * and 300, the output would be "Yes".  However, if instead the user 
 * gives a whole number value outside that range, the computers's 
 * output will be "No".  
 * 
 * Assignment recommendations include: 
 * 
 * - Integer.parseInt(stringValue), to translate the string to an Integer object
 * - a Scanner object, to collect input
 * 
 * Possible other tools: 
 * 
 * - Integer.intValue(), to get the actual int value for the range comparison
 * 
 * String input = scanner.nextLine();
 * Integer convertedInput = Integer.parseInt(input);
 * 
 */

import java.util.Scanner;

public class AssignWk2 {

	public static void main(String[] args) {
		
		// prep for input 
		Scanner firstRawInput = new Scanner(System.in); 
		System.out.println("Type a number between 50 and 300: "); 
		
		int lowerLimit =  50; 
		int upperLimit = 300; 
		// creating upper and lower limit variables for code generalization 
		
		// now collect input 
		String userInput = firstRawInput.nextLine(); 
		
		// now start translating raw input into something useful 
		Integer convertedFirstRaw = Integer.parseInt(userInput); 
		
		// get a useful value 
		int firstProcessedInt = convertedFirstRaw.intValue(); 
		
		String responseString = " "; 
		
		// not sure why tertiary conditional is NOT working???
		/*
		(firstProcessedInt >= lowerLimit) && (firstProcessedInt <= upperLimit) ?
			responseString = "YES" :
			responseString = "NO";
		*/

		if ((firstProcessedInt >= lowerLimit) && (firstProcessedInt <= upperLimit)) {
			responseString = "YES"; 
		} else {
			responseString = "NO";
		}
		
		
		System.out.println(responseString); 
		
		// now close the scanner 
		firstRawInput.close();
		//System.out.println("Scanner input now closed."); 
		
	}

}
