package javaThreads;

//by extending thread class.
public class Example5 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 5; i++)
			{						
				Thread.sleep(2000);	
				System.out.println(Thread.currentThread()+" - "+i);	
			}
		}
		catch (Exception e) {
				System.out.println(e.getMessage());
			}			
			
		}
		
}
