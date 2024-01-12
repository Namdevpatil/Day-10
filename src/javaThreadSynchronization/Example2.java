package javaThreadSynchronization;

public class Example2 extends Thread{
	
	ThreadOperation operation;

	public Example2(ThreadOperation operation) 
	{
		this.operation = operation;
	}	
	
	public void run()
	{
		operation.threadOperation();
	}

}
