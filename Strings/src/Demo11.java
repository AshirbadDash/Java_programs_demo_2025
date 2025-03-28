
public class Demo11 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + s2);
		String s3 = "10";

		System.out.println(s1 + 10);// -->hello10

		System.out.println(10 + 20 + s1);// -->30hello

		System.out.println(s1 + 20 / 10);

		/**
		 * BODMAS stands for Brackets, Orders (i.e., powers and roots), Division,
		 * Multiplication, Addition, and Subtraction. It defines the correct order of
		 * operations to solve a mathematical expression. This rule ensures that
		 * calculations are performed in the correct sequence to achieve the correct
		 * result.
		 */

//		System.out.println(s1+10-5);//error will be thrown

		/**
		 * The concat(String str) method in Java appends the specified string to the end
		 * of another string. This method returns a new string that contains the
		 * original string followed by the string passed as an argument (str).
		 */

		System.out.println(s1.concat(s2));

		/**
		 * join(CharSequence delimiter, CharSequence... elements) Method in Java The
		 * join method is a static method in the String class (introduced in JDK 1.8)
		 * that concatenates the given elements with the specified delimiter and returns
		 * the resulting string.
		 * 
		 * public static String join(CharSequence delimiter, CharSequence... elements)
		 * ...(var) it may take multiple argument inputs
		 * 
		 * static method
		 * 
		 * we can provide null values in charSequence but not in delimiter
		 * 
		 */

		/**
		 * -------------------------------------------------
		 * 
		 * The subSequence(int beginIndex, int endIndex) method returns a CharSequence.
		 * The subsequence starts with the character at the specified beginIndex and
		 * ends with the character at endIndex - 1.
		 * 
		 * It throws a java.lang.StringIndexOutOfBoundsException if:
		 * 
		 * beginIndex < 0
		 * 
		 * endIndex > length of the string
		 * 
		 * beginIndex > endIndex
		 */

		String sub = "this is demo";
		String modify=(String) sub.subSequence(3, 10);
		System.out.println(sub.subSequence(3, 9));

		/**
		 * There are two **`substring`** methods in the `String` class: 1.
		 * **`substring(int beginIndex)`** 2. **`substring(int beginIndex, int
		 * endIndex)`**
		 * 
		 * It returns a **new string** that is a substring of the original string. The
		 * substring **starts** at the specified `beginIndex` and **extends up to** the
		 * character at `endIndex - 1`.
		 */
	}
}
