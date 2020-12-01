class BThread extends Thread 
{
	public void run()
	{
		int i=0;
		try
		{
		  while(i<10)
		  {
			  sleep(3000);
			  System.out.println("world");
			  i++;
		  }
		}
		
		catch(InterruptedException ie)
		{
			System.out.print(ie);
		}
	}
}