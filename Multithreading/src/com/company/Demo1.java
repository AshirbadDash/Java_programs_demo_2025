package com.company;

public class Demo1 {

	// thread and process

	/**
	 * process have multiple threads
	 * 
	 * process is an instance of a program that is getting executed
	 * 
	 * it has its own resource like memory,thread etc.os allocate these resource to
	 * process when it is created.
	 * 
	 * 
	 */

	/**
	 * thread is a lightweight process
	 * 
	 * or
	 * 
	 * The smallest sequence of instructions that are executed by cpu independently
	 * 
	 * 1 process can have multiple threads
	 * 
	 * when a process is created it starts with 1 thread and that initial thread
	 * know as main thread and from that we can create multiple threads to perform
	 * task concurrently.
	 */

	/**
	 * 
	 * @param args
	 * 
	 *             whenever a process is created a new jvm instance is created with
	 *             all of memory heap stack register counter ...
	 * 
	 *             when we do java (class name) a new jvm instance is created to
	 *             execute the process
	 * 
	 *             we can set the minimum heap size by java -Xms256m -Xmx2g
	 *             className to allocate minimum and maximum heap size
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("thread name " + Thread.currentThread().getName());

	}

}
