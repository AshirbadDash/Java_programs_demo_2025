
public class Demo2 {
	/**
	 * @implNote String constant pool or string literal pool is an area on where
	 *           java stores string literal values.
	 * 
	 *           -->METHOD AREA -->1.6 VERSION STRING POOL WAS HERE (PERMGEN)
	 * 
	 *           -->HEAP AREA -->AFTER 1.7 VERSION SCP IS STORED HERE (TO INCRASE OR
	 *           DECREASE SIZE)
	 *
	 *           -->STACK AREA
	 * 
	 *           -->PC REGISTERS
	 *
	 *           -->NATIVE METHOD AREA
	 * 
	 * 
	 * 
	 */

	String s1 = new String("deepak");// string literal always take memory in string pool one object will be created
										// inside the scp for future reference jvm will allocate memory
										// internally
	// due to new keyword object will be created inside heap area and s1 will point
	// to it // 2 objects will be created

	String s2 = "rahul";// only string literal it will be created inside scp but here s2 will //one
						// object will be created

	// heap objects will be removed by garbage collection but..

	// The String objects present in string pool are not applicable for garbage
	// collection because a reference variable internally is maintained by jvm

	// if we provide same literal then object will be created in heap area but not
	// in string constant pool

	// IN STRING POOL IT WILL SEARCH FOR values if same literal is provided if
	// already present then it will point to same

}
