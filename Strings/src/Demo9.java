

public class Demo9 {

	// String searching methods

	/**
	 * indexOf()
	 * 
	 * The indexOf() method returns the position of the first occurrence of a
	 * specified character or substring in a string. If the character or substring
	 * is not found, it returns -1.
	 * 
	 * lastIndexOf()
	 * 
	 * The lastIndexOf() method returns the position of the last occurrence of a
	 * specified character or substring in a string. If the character or substring
	 * is not found, it returns -1.
	 * 
	 * contains()
	 * 
	 * The contains() method checks whether a specified sequence of characters
	 * exists in a given string. It returns true if the sequence is found;
	 * otherwise, it returns false.
	 * 
	 * charAt()
	 * 
	 * The charAt(int index) method returns the character at the specified index in
	 * a string. The index value should be between 0 and length() - 1.
	 * 
	 * endsWith()
	 * 
	 * The endsWith() method checks whether a string ends with the specified suffix.
	 * If the string ends with the given suffix, it returns true; otherwise, it
	 * returns false.
	 * 
	 *
	 * StartsWith()
	 * 
	 * The startsWith() method checks whether a string starts with the specified
	 * prefix. If the string starts with the given prefix, it returns true;
	 * otherwise, it returns false.
	 */
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(3));
		char s12=s1.charAt(4);
		System.out.println(s1.contains("e"));
		System.out.println(s1.startsWith("d"));
		System.out.println(s1.endsWith("ee"));
	}

}
