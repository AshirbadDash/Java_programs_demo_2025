import java.util.Scanner;

public class TextBlock_StringTemplate {
	public static void main(String[] args) {
		String data = "my name is ashirbad dash";

		String format = "my name\n" + "is ashirbad\n" + "dash";
		String block = """
				my name
				is
				ashirbad dash
				""";

		System.out.println(data);

		System.out.println(block);

		// ----------------------------------------------------

		/**
		 * String Template
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("user please enter the numbers");
		String a = sc.next();

		String b = sc.next();

//		String sum=STR."\{a}+\{b}=\{a+b}";

		// string interpolation

	}

}
