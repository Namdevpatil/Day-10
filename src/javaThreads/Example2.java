package javaThreads;

//by implementing Runnable interface.
public class Example2 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
}
