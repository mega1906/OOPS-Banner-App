/** 
* OOPSBANNERAPP UC8 - OOPS BANNER Display Application
* 
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Developer
* @version 8.0
**/

import java.util.*;

class OopsBannerApp{
	/**
	Create a hashmap containing ASCII patterns for the characters
	**/
	public static HashMap<Character, String[]> createCharacterMap() {
		// Create a new HashMap to store the Pattern for each character
		HashMap<Character, String[]> charMap = new HashMap<>();
		// Add the character and pattern to charMap
		charMap.put('O', new String[] 
			{
				"     ***   ",
				"   **   ** ",
				"  **     **",
				"  **     **",
				"  **     **",
				"  **     **",
				"  **     **",
				"   **   ** ",
				"     ***   "
			});
		charMap.put('P', new String[] 
			{
				"*******",
				"**    *",
				"**    *",
				"**    *",
				"*******",
				"**     ",
				"**     ",
				"**     ",
				"**     "
			});
			
		charMap.put('S', new String[] 
			{
				" ***** ",
				" **",
				"**",
				" **",
				"   ****",
				"      **",
				"       **",
				"      **",
				"   ***** "
			});
		return charMap;
	}
	/**
	Method to print banner message using the charMap 
	**/
	public static void displayBanner(String message, HashMap<Character, String[]> charMap){
		int patternLength = charMap.get('O').length;
		for (int i = 0; i < patternLength; i++){
			System.out.println(charMap.get('O')[i] + charMap.get('O')[i] + charMap.get('P')[i] + charMap.get('S')[i]);
		}
	}
	/**
	Main function to initialize the charMap and call the methods to display the banner
	**/
	public static void main(String[]args){
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}
}