package javaThreads;

public class Test4 {

	public static void main(String[] args) {
		
		Example4 example1 = new Example4();
		example1.setName("Shravani");
		//example1.setPriority(Thread.MAX_PRIORITY);
		example1.start();
		
		Example4 example2 = new Example4();
		example2.setName("Gyaneshwar");
		//example2.setPriority(Thread.MIN_PRIORITY);
		example2.start();

	}

}
