
public class Demo13 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("deepak");
		System.out.println(sb.capacity());
		sb.append("java");

		/**
		 * three ways to create string
		 * 
		 * 1.string class
		 * 
		 * 2.stringBuffer class
		 * 
		 * 3.stringBuilder class
		 * 
		 */

		// String objects are immutable if we change anything it will create a new
		// object

		/**
		 * in case of stringBuffer it will create an mutable object
		 * 
		 * in stringBuffer all methods are synchronized
		 * 
		 */

		/**
		 * Synchronization in Java guarantees that no two threads can execute a
		 * synchronized method which requires the same lock simultaneously or
		 * concurrently. And thus, synchronization increases waiting time of thread and
		 * effects performance of the system.
		 */

		// when we should use string and stringBuffer
		// if the data does not change or change one or two times only,use string
		// if data is constantly or frequently changing like in calculator NotePad etc
		// we should use string buffer

		// string buffer is a class

		/**
		 * syntax of stringBuffer class
		 * 
		 * public final class stringBuffer extends AbstractStringBuilder implements
		 * java.io.serializable,charSequence
		 * 
		 * 4 constructors
		 * 
		 * StringBuffer()
		 * 
		 * StringBuffer(CharSequence)
		 * 
		 * StringBuffer(String str)
		 * 
		 * StringBuffer(int capacity)
		 * 
		 * ##methods
		 * 
		 * public synchronized int length();
		 * 
		 * public synchronized int capacity();
		 * 
		 * public synchronized StringBuffer append(String str);
		 * 
		 * public synchronized StringBuffer insert(int offset, String str);
		 * 
		 * public synchronized StringBuffer reverse();
		 * 
		 * public synchronized StringBuffer delete(int start, int end);
		 * 
		 * public synchronized StringBuffer deleteCharAt(int index);
		 * 
		 * public synchronized StringBuffer replace(int start, int end, String str);
		 * 
		 * public synchronized void ensureCapacity(int minimumCapacity);
		 * 
		 * public synchronized char charAt(int index);
		 * 
		 * public synchronized int indexOf(String str);
		 * 
		 * public synchronized int lastIndexOf(String str);
		 * 
		 * public synchronized String substring(int start);
		 * 
		 * public synchronized CharSequence subSequence(int start, int end);
		 * 
		 */

		System.out.println(sb.capacity());
		/**
		 * StringBuffer object can store 16 characters(default capacity)
		 * 
		 * capacity method tells how many characters can be stored in string object
		 * 
		 * 16+length
		 */

		/**
		 * if we already know how much capacity is needed to store then we can give
		 * initial capacity
		 * 
		 */
		StringBuffer sb2 = new StringBuffer(10000);
		System.out.println(sb2.capacity());

		// if we append and the size increases then the space will increase as (old
		// (capacity*2)+2

		// or

		// (old capacity+1)*2

		// sb.length() how many characters are present

		/**
		 * StringBuffer Does Not Override equals() The StringBuffer class does not
		 * override the equals() method from Object.
		 * 
		 * This means equals() behaves like Object.equals(), which compares object
		 * references instead of content.
		 */

		/**
		 * toString() it will convert string buffer to string type
		 * 
		 * ensureCapacity() //it will make the default initial capacity customized
		 * 
		 * setCharAt()
		 * 
		 * setLength() will set the max length
		 * 
		 * trimToSize() will delete the unused spaces
		 */
	}

}
