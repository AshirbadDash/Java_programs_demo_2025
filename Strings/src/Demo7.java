
public class Demo7 {
	public static void main(String[] args) {
		// length method is of string class will give the output in int value

		String name = "abcd"; // if String name=null; it will throw null pointer exception
		int i = name.length();
		if (i == 0) {
			System.out.println("name is empty");
		}
		else {
			System.out.println("name is not empty and length is"+i);
		}

			/**
			 * The isEmpty() method of the String class was introduced in Java since JDK
			 * 1.6. This method returns true if the given string is empty; otherwise, it
			 * returns false. It returns true if the length of the string is 0.
			 * 
			 * it will return boolean value
			 * 
			 */

			String email ="";
			boolean b = email.isEmpty();
			

			/**
			 * ------------- trim()
			 * 
			 * it will return string value
			 * 
			 * The trim() method of the String class eliminates only leading and trailing
			 * spaces. The Unicode value of the space character is \u0020. The trim() method
			 * in Java checks for this Unicode value before and after the string; if it
			 * exists, it removes the spaces and returns the resulting string.
			 * 
			 * it will not remove middle spaces of the character sequqence only befpre and
			 * after spaces will be removed
			 * 
			 * we can use trim() and length() together
			 * 
			 * we cannot use name.length().trim it will give integer value and trim will not
			 * be used
			 * 
			 */
			String address = " bengaluru karnataka   ";
			System.out.println(address.trim());
//			System.out.println(address.trim().length());

		}

	}


