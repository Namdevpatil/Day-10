package javaThreads;

public class Test5 {

	public static void main(String[] args) {
		
		Example5 example1 = new Example5();
		example1.setName("Shravani");
		example1.start();
		
		Example5 example2 = new Example5();
		example2.setName("Gyaneshwar");
		example2.start();

	}

}
