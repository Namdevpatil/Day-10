package javaThreadSynchronization;

public class Test {

	public static void main(String[] args) {
		
		ThreadOperation operation = new ThreadOperation();
		
		Example1 example1 = new Example1(operation);
		example1.setName("Shravani");
		example1.start();
		
		Example2 example2 = new Example2(operation);
		example2.setName("Gyaneshwar");
		example2.start();

	}

}
