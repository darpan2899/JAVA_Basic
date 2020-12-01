class NonTeaching extends Employee
{
	
	String TypeOfWork;
	
	NonTeaching(String n,int a,int s,int e,String tow)
	{
		super(n,a,s,e);
		
		TypeOfWork=tow;
	}
	void display()
	{
		super.display();
	    System.out.println("\nType Of Work=" + TypeOfWork);
	}
}
	