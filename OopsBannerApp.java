/** 
* OOPSBANNERAPP UC5 - OOPS BANNER Display Application
* 
* This uses array and String.join() method to store the pattern and print the pattern using for loop
* 
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.

* @author Developer
* @version 5.0
**/
class OopsBannerLoop{
	public static void main(String[] args){
		// Creating an array and using String.join() method to form the pattern
		String oops[] = {
			String.join(" ", "   ***   " , "   ***   " , " ******   " , "  ***** "), 
			String.join(" "," **   **" , "  **   **" , "  **   **" ,  " **"), 
			String.join(" ","**     **" , "**     **" , " **    **" , "**"),
			String.join(" ","**     **" , "**     **" , "  **   **" , " **"),
			String.join(" ","**     **" , "**     **" , " ****** " , "   ****"),
			String.join(" ","**     **" , "**     **" , " **     " , "      **"),
			String.join(" ","**     **" , "**     **" , " **     " , "       **"),
			String.join(" "," **   **" , "  **   **" , "  **     " , "      **"),
			String.join(" ","   ***   " , "   ***   " , " **     " , "  ***** ")
		};
		
		// Printing the pattern using for loop
		for (String i : oops){
			System.out.println(i);
		}	
	}
}