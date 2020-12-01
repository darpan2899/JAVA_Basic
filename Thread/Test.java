class Test
{
	public static void main(String args[])
	{
		
	 AThread at = new AThread();
	 BThread bt = new BThread();
	
	 at.start();
	 bt.start();
	 
	}
}