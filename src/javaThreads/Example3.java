package javaThreads;

//by extending thread class.
public class Example3 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		
	}
}
