package javaThreadSynchronization;

public class ThreadOperation {

	public synchronized void threadOperation()
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
