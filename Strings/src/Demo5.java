
public class Demo5 {
	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * The == operator is used for reference comparison (also known as address
		 * comparison). It checks whether two references point to the same memory
		 * location
		 * 
		 */

		/**
		 * 
		 * 
		 * 
		 * z11 Methods of the `Object` Class in Java**
		 * 
		 * 1. **`clone()`** – Creates and returns a copy of the object (if the class
		 * implements `Cloneable`).
		 * 
		 * 2. **`equals(Object obj)`** – Compares the current object with another object
		 * for equality.
		 * 
		 * 3. **`finalize()`** – Called by the garbage collector before an object is
		 * destroyed.
		 * 
		 * 4. **`getClass()`** – Returns the runtime class of the object.
		 * 
		 * 5. **`hashCode()`** – Returns a hash code value for the object.
		 * 
		 * 6. **`notify()`** – Wakes up a single thread that is waiting on the object's
		 * monitor.
		 * 
		 * 7. **`notifyAll()`** – Wakes up all threads waiting on the object's monitor.
		 * 
		 * 8. **`toString()`** – Returns a string representation of the object.
		 * 
		 * 9. **`wait()`** – Causes the current thread to wait indefinitely until
		 * another thread invokes `notify()` or `notifyAll()`.
		 * 
		 * 10. **`wait(long timeout)`** – Causes the current thread to wait for a
		 * specified amount of time before resuming execution.
		 * 
		 * 11.`wait(long timeout, int nanos)`** – Causes the current thread to wait for
		 * the specified time (in milliseconds and nanoseconds).
		 * 
		 * 
		 * 
		 * 
		 */

		String s1 = new String("deepak");
		String s2 = new String("deepak");
		System.out.println(s1 == s2);// false
		// it will give false as s1 is pointing to one object and s2 to another object

		String s3 = "deepak";
		System.out.println(s1 == s3);// false

		String s4 = "amit";
		String s5 = "amit";
		System.out.println(s4 == s5);

		// equals method is a part of Object class
		// it is used do reference or address comparison inside object class

		// but in string class equals method is override
		// and it is doing content check

		System.out.println(s1.equals(s2));

	}

}
