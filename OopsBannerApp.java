/** 
* OOPSBANNERAPP UC7 - OOPS BANNER Display Application
* 
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Developer
* @version 7.0
**/
class OopsBannerApp{
	/**
	CharacterPatternMap - Inner class
	It has methods to create print the patterns
	**/
	static class CharacterPatternMap{
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
		public static void printPattern(String[] oPattern, String[] pPattern, String[] sPattern){
			// Printing the pattern using for loop
			for (int i = 0; i < oPattern.length; i++){
				System.out.println(oPattern[i] + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
			}	
		}
	}
	
	/*
	In the Main method, create an object and call the print pattern method. 
	The printPattern method has three parameters for which the pattern method is called using the object.
	*/
	public static void main(String[] args){
		CharacterPatternMap charMaps = new CharacterPatternMap();
		charMaps.printPattern(charMaps.getOPattern(), charMaps.getPPattern(), charMaps.getSPattern());
	}
	
}