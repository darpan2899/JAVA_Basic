class AThread extends Thread 
{
	public void run()
	{
		int i=0;
		try
		{
		  while(i<10)
		  {
			  sleep(1000);
			  System.out.println("hello");
			  i++;
		  }
		}
		catch(InterruptedException ie)
		{
			System.out.print(ie);
		}
	}
}