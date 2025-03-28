
public class Demo12 {
	public static void main(String[] args) {

		/**
		 * 
		 * case conversion
		 * 
		 * toUpperCase()
		 * 
		 * toLowerCase()
		 */

		String s1 = "deepak";
		System.out.println(s1.toUpperCase());

		System.out.println(s1.toLowerCase());

		/**
		 * Type conversion
		 * 
		 * 
		 * The valueOf() method converts different types of values into a string. Using
		 * String.valueOf(), we can convert int, long, float, double, boolean, char,
		 * object, or any other type into a String.
		 * 
		 * Key Points: valueOf() is a static method, so it is called using the String
		 * class. If the argument is null, it returns the string "null". It is commonly
		 * used for type conversion.
		 */

		int i = 10;
		String s2 = String.valueOf(i);

		/**
		 * toCharArray
		 * 
		 * The toCharArray() method converts a given string into an array of characters.
		 * The length of the returned array is equal to the length of the string.
		 */
	}

}
