package javaThreads;

public class Test {

	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		//example1.run(); /** Thread[main,5,main] */
		example1.start();
		
		Example1 example2 = new Example1();
		//example1.run(); /** Thread[main,5,main] */
		example2.start();
		//example2.start(); => It is never legal to start a thread more than once.

	}

}
