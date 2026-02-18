/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 3 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enchancing code readability and efficiency
 * by utilizing the String.join() method to create each line of banner. 
 * This approach overcomes the drawbacks of using the + operator for the string concatenation, which can lead
 * to code inefficiency due to creation of mutiple intermediate String objects in memory.
 *
 * @author Developer
 * @version 3.0
 */


// Extend use case UC2 to use String.join() method to create each line of the "OOPS" banner 
// instead of concatenating strings with + operator. This is essentially to overcome the
// drawbacks of using the + operator for string concatenation which essentially creates
// multiple intermediate String objects in memory leading to inefficiency.

// Hint: Use String.join(" ", ...) to the join the parts of each line with spaces.


public class OopsBannerStringJoin {
	// Main method to run banner display
	// Use System.out.println() to print each line of the OOPS Banner to create
	// the visual effect for the message "OOPS". Construct each line using
	// String.join() method for better readability and efficiency.
	// Each line corresponds to a row in the banner for the letters O, O, P, S
	
	public static void main(String[] args) {
		System.out.println(String.join(" ", "  ****  ", "  ****  ", "*******", "*******"));
		System.out.println(String.join(" ", " *    * ", " *    * ", "*     *", "*"));
		System.out.println(String.join(" ", "*      *", "*      *", "*     *", "*"));
		System.out.println(String.join(" ", "*      *", "*      *", "*******", "*******"));
		System.out.println(String.join(" ", "*      *", "*      *", "*      ", "      *"));
		System.out.println(String.join(" ", "*      *", "*      *", "*      ", "      *"));
		System.out.println(String.join(" ", " *    * ", " *    * ", "*      ", "      *"));
		System.out.println(String.join(" ", "  ****  ", "  ****  ", "*      ", "*******"));
	}
}
