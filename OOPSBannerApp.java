/**
 *
 * OOPSBannerApp UC7 - Store Character Pattern in a class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate 
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

// Extend User story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using mappings. Thereby addressing the drawback of not having 
// centralized character pattern management system.


public class OOPSBannerApp {
	/**
	 *
	 * CharacterPatternMap - Inner Class for storing character-to-pattern mappings
	 *
	 * Encapsulates a single character and its corresponding ASCII art pattern.
	 * Provides immutable access to character and pattern data through getters.
	 */

	static class CharacterPatternMap {
		/** The character being represented */
		Character character;
		/** The ascii art pattern lines for the character */
		String[] pattern;

		/**
		 * Constructs a CharacterPatternMap with a character and its pattern
		 *
		 * @param character the character to be mapped
		 * @param pattern the ASCII art pattern representation as arrays of Strings.
		 */
		public CharacterPatternMap(Character character, String[] pattern) {
			/**
			 * Retrieves the mapped character
			 * @return the character associated with this pattern map
			 */
			this.character = character;
			this.pattern = pattern;
		}

		public Character getCharacter()  {
			/**
			 * Retrieves the ASCII art pattern
			 * @return the character assosciated with this pattern map
			 */

			return character;
		}

		public String[] getPattern() {
			/**
			 * Retrieves the ASCII art pattern
			 * @return the pattern array representing the character
			 */
			return pattern;
		}

	}

	/**
	 * Static method to Create and initialize CharacterPatternMap array for predefined characters
	 *
	 * Populates pattern maps for letters 'O', 'P', 'S' and space character.
	 * Each character has a 7-line ASCII art representation.
	 *
	 * @return array of CharacterPatternMap objects containing character Patterns
	 */
	public static CharacterPatternMap[] createCharacterPatternMaps() {
		String[] oP = new String[] {
			"  ****  ",
			" *    * ",
			"*      *",
			"*      *",
			"*      *",
			"*      *",
			" *    * ",
			"  ****  ",
		};

		String[] pPat = new String[] {
			"*******",
			"*     *",
			"*     *",
			"*******",
			"*      ",
			"*      ",
			"*      ",
			"*      ",
		};

		String[] sP = new String[] {
			"*******",
			"*",
			"*",
			"*******",
			"      *",
			"      *",
			"      *",
			"*******",
		};


		CharacterPatternMap oPattern = new CharacterPatternMap('O', oP);
		CharacterPatternMap pPattern = new CharacterPatternMap('P', pPat);
		CharacterPatternMap sPattern = new CharacterPatternMap('S', sP);

		CharacterPatternMap[] map = new CharacterPatternMap[3];
		map[0] = oPattern;
		map[1] = pPattern;
		map[2] = sPattern;
		return map;
	}

	public static String[] getCharacterPattern(Character ch, CharacterPatternMap[] charMaps) {
		for (int i=0; i < charMaps.length; i++) {
			if(ch.equals(charMaps[i].character)) {
				return charMaps[i].pattern;
			}
		}
		return charMaps[0].pattern;

	}

	public static void printMessage(String message, CharacterPatternMap[] charMaps) {
		// System.out.println(getCharacterPattern('O') + " " + getCharacterPattern('O') + " " + getCharacterPattern('P') + " " + getCharacterPattern('S'));
		/*for (Character c : message) {
			String[] lines = getCharacterPattern(c, charMaps);
			for (String line : lines) {
				System.out.println(line);
			}
		}
		*/

		for (int i=0; i < message.length(); i++) {
			Character c = message.charAt(i);
			String[] lines = getCharacterPattern(c, charMaps);
			for (String line : lines) {
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		String message = "OOPS";
		printMessage(message, charMaps);
	}
}
