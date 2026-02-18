/** 
* OOPSBANNERAPP UC6 - OOPS BANNER Display Application
* 
* This uses array and String.join() method to store the pattern and print the pattern using for loop
* 
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.

* @author Developer
* @version 6.0
**/
class OopsBannerApp{
	/* 
	Define methods getOPattern, getPPattern and getSPattern that returns string arrays representing the ASCII art for each letter
	*/
	public static String[] getOPattern(){
		return new String[] 
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
		};
		
	}
	public static String[] getPPattern(){
		return new String[] 
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
		};
	}
	public static String[] getSPattern(){
		return new String[] {
			" ***** ",
			" **",
			"**",
			" **",
			"   ****",
			"      **",
			"       **",
			"      **",
			"   ***** "
		};
	}
	/*
	In the Main method, call these methods to get the patterns and store them in string arrays
	Use a loop to assemble and print each line of the banner
	*/
	public static void main(String[] args){
		// Creating an array and using String.join() method to form the pattern
		String[] oPattern = getOPattern();
		String[] pPattern = getPPattern();
		String[] sPattern = getSPattern();
		
		// Printing the pattern using for loop
		for (int i = 0; i < oPattern.length; i++){
			System.out.println(oPattern[i] + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
		}	
	}
}