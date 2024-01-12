package javaThreadSynchronization;

public class Example1 extends Thread{
	
	ThreadOperation operation;

	public Example1(ThreadOperation operation) 
	{
		this.operation = operation;
	}	
	
	public void run()
	{
		operation.threadOperation();
	}

}
