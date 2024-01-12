package javaThreads;

//by extending thread class.
public class Example1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
