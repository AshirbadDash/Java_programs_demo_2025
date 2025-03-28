
public class FormattingOutput {

	public static void main(String[] args) {
		double d = 10000.0 / 30.0;
		System.out.printf("%f", d);
		System.out.println();
		System.out.printf("%.2f", d);

		String s1 = "hello";

		boolean b = true;
		/**
		 * % --> it is asking for an argument
		 * 
		 * f--> it will convert to float
		 * 
		 * s-->string
		 * 
		 * d-->integer
		 * 
		 * c-->character
		 * 
		 * b-->boolean
		 * 
		 */

		// we can also take multiple arguments

		System.out.printf("%s, %b java", s1, b);

		// we can also use flags
//refer md

//		% → Start of a format specifier.
//
//		( → Flag: Encloses negative numbers in parentheses.
//
//		13 → Width: Ensures a minimum width of 13 characters.
//
//		. → Decimal separator.
//
//		2f → Precision: Displays 2 decimal places.
//
//		f → Conversion Character: Format as floating-point.

		// we can use string.format() or use system.out.printf()
	}
}
