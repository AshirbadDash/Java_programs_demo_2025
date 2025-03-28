
public class Demo10 {
	/**
	 * String comparison methods
	 * 
	 * equals()
	 *
	 * equalsToIgnoreCase()
	 * 
	 * compareTo()
	 * 
	 * compareToIgnore()
	 *
	 *
	 */

	public static void main(String[] args) {
		String s1 = "deepak";
		String s2 = "amit";

		System.out.println(s1.equals(s2));// false
		// will return boolean value''

		System.out.println(s1.equalsIgnoreCase(s2));
		// will ignore case

		// we can check if our string is empty or not using equals
		System.out.println(s1.equals(""));

		/**
		 * compareTo() and compareToIgnoreCase() methods are used for comparing two
		 * strings lexicographically. Each character of both strings is converted into a
		 * Unicode value for comparison. If both strings are equal, then this method
		 * returns 0; otherwise, it returns a positive or negative value.
		 */

		// compateTo() returns int value
		String a1 = "a";
		String a2 = "A";
		// it will be converted to unicode decimal values and it will be subtracted and
		// output will be given

		/**
		 * 0 --> s1=s2
		 * 
		 * +ve->s1>s2
		 * 
		 * -ve->s2>s1
		 */

		// if we make other string empty and use compareTo method it will give length

	}
}
