
public class Demo3 {
	public static void main(String[] args) {

		/**
		 * 
		 * immutable means cannot changed (unchangeable)
		 * 
		 * immutability concept is used for String Objects i.e String objects are
		 * immutable it means once string object is created its data or state can't be
		 * changed but a new String object is created
		 * 
		 *
		 * 
		 */

		String s = new String("deepak");
		s.concat(" java");
		// new object will be created as deepak java literal and inside string pool
		// object will be created with value java
		System.out.println(s);// will print deepak

		s = s.concat("python");// now deepak python literal will be created in heap and python will be created
								// in pool
		// s will now refer to new object deepak python

		// why string object are immutable

		/**
		 * 
		 * Strings are immutable in Java because String objects are cached in the String
		 * pool. Since cached String literals are shared between multiple references,
		 * there is always a risk that one reference’s modification could affect all
		 * others.
		 * 
		 * For example, if one person changes their city from "Mohali" to "Delhi", all
		 * other references would also get affected.
		 * 
		 */
		String city1 = "bengaluru";// will check  if no object is present before with same literal if no then it
									// will create else it will point to same object

		// if multiple references are reffering to same object if we change the value of
		// one object all others will be affected/
		// because of which they are made immutable so that new object will be created
		// and it will point to that
		
		
		

	}

}
