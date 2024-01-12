package javaThreads;

public class Test3 {

	public static void main(String[] args) {
		
		Example3 example1 = new Example3();
		example1.start();
		
		Example3 example2 = new Example3();
		example2.start();

	}

}
