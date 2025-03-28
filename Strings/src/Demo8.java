/**
 * methods to update string
 */
public class Demo8 {

	/**
	 * 1.replace()
	 * 
	 * 2.replaceFirst()
	 * 
	 * 3.replaceAll()
	 * 
	 * remove () and deleteCharAt() are of string buffer and reader
	 * 
	 */

	public static void main(String[] args) {
		String s1 = "this is demo";
		s1.replace("is", "was");
		System.out.println(s1);
		// it will replace the word with the given if it found is it will replace
		// thwas was demo

		System.out.println(s1.replaceFirst("is", "was"));
		// it will replace the first string

		System.out.println(s1.replaceAll("is", "was"));
		// it will replace same as replace () but here we can also give regex

		System.out.println(s1.replaceAll("is(.)", "was"));// thwaswasdemo
		System.out.println(s1.replaceAll("is(.*)", "was"));// thwas

	}

}
