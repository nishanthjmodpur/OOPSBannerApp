/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented-Programming concepts
 * such as Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap there by enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */

// Extend the User Story 8 to utilize advanced Object-Oriented-Programming concepts
// such as Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "OOPS" banner
// using these mappings.

// Key requirements:
// 1. Use HashMap to store ASCII art patterns for characters.
// 2. Create methods to generate and retrieve character patterns
// 3. Retrieve and display patterns for the message "OOPS"
// 4. Implement modular and reusable character pattern system
// 5. Utilizing Collections Framework for pattern management


import java.util.HashMap;

public class OOPSBannerApp {
	/**
	 *
	 *
	 * Create a HashMap containing ASCII art patterns for supported characters.
	 *
	 * <p> Each character is mapped to an array of strings where each string represents
	 * one line of the character's ASCII art pattern. All patterns are assumed to have
	 * the same height.
	 *
	 * @return a HashMap where keys are characters (char) and values are String arrays
	 * 		representing the ASCII art pattern lines for each character.
	 */
	public static HashMap<Character, String[]> createCharacterMap() {
		// Create a HashMap to store character patterns
		HashMap<Character, String[]> charMap = new HashMap<>();

		charMap.put('O', new String[] {
			"  ****  ",
			" *    * ",
			"*      *",
			"*      *",
			"*      *",
			"*      *",
			" *    * ",
			"  ****  ",
		});

		charMap.put('P', new String[] {
			"*******",
			"*     *",
			"*     *",
			"*******",
			"*      ",
			"*      ",
			"*      ",
			"*      ",
		});

		charMap.put('S', new String[] {
			"*******",
			"*",
			"*",
			"*******",
			"      *",
			"      *",
			"      *",
			"*******",
		});

		return charMap;
	}

	/**
	 * Displays a banner message using the provided character map.
	 *
	 * <p> This method renders the input message as a large ASCII art banner by iterating
	 * through each line of the character patterns and horizontally concatenaating the
	 * corresponding line from each character in the message.
	 *
	 * @param message the String message to display as a banner. Each character must
	 * 		exist as a key in the charMap
	 * @param charMap a HashMap containing character patterns
	 *
	 */

	public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
		// Getting pattern height. Assuming all patterns have the same height
		for (int i=0; i < message.length(); i++) {
			String[] pat = charMap.get(message.charAt(i));
			for (String line : pat) {
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}
}
