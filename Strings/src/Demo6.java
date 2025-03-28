
public class Demo6 {

	// String constructor
	// constructor are the methods with same name as of class name with no return
	// type it is used to initialize the object

	// string has many constructors because of overloading

	/**
	 * 
	 * @param args
	 * 
	 *             1.no arguments constructor
	 * 
	 *             2.string type constructor
	 * 
	 *             3.stringBuffer constructor
	 * 
	 *             4.StringBuilder constructor
	 * 
	 *             5.char[] constructor
	 * 
	 *             6.byte[] constructor
	 * 
	 *             . .
	 * 
	 *             .
	 *
	 * 
	 */

	public static void main(String[] args) {

		/**
		 * Strings are immutable in Java, meaning once a password is stored as a String,
		 * it remains in memory until the garbage collector clears it. However, String
		 * objects are stored in the String Literal Pool (SCP) for reusability, and
		 * garbage collection does not immediately apply to SCP, posing a security risk.
		 * If an attacker gains access to memory, they may retrieve the password in
		 * plaintext since it cannot be modified until garbage collection occurs. With a
		 * char[] (character array), you can explicitly overwrite the password data
		 * after usage by setting the array elements to blank values (e.g., '*'). This
		 * ensures that the password does not remain in memory longer than necessary,
		 * reducing the risk of it being exposed. Example: Using char[] for Password
		 * Handling java Copy Edit import java.util.Arrays; import java.io.Console;
		 * 
		 * public class SecurePasswordHandling { public static void main(String[] args)
		 * { Console console = System.console(); if (console == null) {
		 * System.out.println("No console available"); return; }
		 * 
		 * char[] password = console.readPassword("Enter your password: ");
		 * 
		 * // Use the password securely (e.g., authentication)
		 * 
		 * // Overwrite password data after use Arrays.fill(password, '*');
		 * System.out.println("Password cleared from memory."); } }
		 */

		String s1 = new String();// empty object will be created
		System.out.println();

		// string original
		String s2 = new String("deepak");
		System.out.println();

		// stringBuffer

		StringBuffer sb = new StringBuffer("deepak");
		String s3 = new String(sb);
		System.out.println(sb);

		// stringBuilder

		StringBuilder builder = new StringBuilder("deepak");
		String s4 = new String(builder);
		System.out.println(builder);

		// byte array can be passed to string constructor

		// it will convert to characters

		byte[] b = { 101, 102, 103 };
		String s5 = new String(b);

		// char array can be passed to string constructor

		// it will create a string
		char[] c = { 'a', 'b', 'c' };
		String s6 = new String(c);

		// why array is preffered over string for storing password

		//it will be stored in garbage 
		
		// if we print char array object address will be printed and in case of string
		// literal will be printed
	}

}
