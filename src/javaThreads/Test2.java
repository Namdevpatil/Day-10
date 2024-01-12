package javaThreads;

public class Test2 {

	public static void main(String[] args) {
		
		Example2 example1 = new Example2();
		Thread thread1 = new Thread(example1);
		thread1.start();
		
		Example2 example2 = new Example2();
		Thread thread2 = new Thread(example2);
		thread2.start();

	}

}
