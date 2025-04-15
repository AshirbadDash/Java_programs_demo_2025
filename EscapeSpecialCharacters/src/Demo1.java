
public class Demo1 {

	public static void main(String[] args) {

		/**
		 * 
		 * /"Hello"/
		 * 
		 * /'Hello'/
		 * 
		 * '/'Hello'/'
		 * 
		 * "/'Hello'/"
		 * 
		 * "Hello"
		 * 
		 * I know "java" and "programming"
		 * 
		 * 'I know "java" and "programming
		 */

		System.out.println("/\"Hello\"/");

		System.out.println("/'Hello'/");

		System.out.println("'/'Hello'/'");

		System.out.println("\"/'Hello'/\"");

		System.out.println("\"Hello\"");

		System.out.println("I know \"java\" and \"programming\"");

		System.out.println("'I know \"java\" and \"programming\"");

		System.out.println("hello\nworld");
		System.out.println("hello\tworld");
		System.out.println("hello\nworld");
		System.out.println(getXpath("java"));

	}

	public static String getXpath(String name) {
		String xpath = "//input[@id='" + name + "' ] ";

		// input[@id='naveen']
		return xpath;
	}

}
