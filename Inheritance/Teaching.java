class Teaching extends Employee
{
	
	String NameOfSubject;
	
	Teaching(String n,int a,int s,int e,String ns)
	{
		super(n,a,s,e);
		
		NameOfSubject=ns;
	}
	void display()
	{
		super.display();
	    System.out.println("\nName Of Subject=" + NameOfSubject);
	}
}
	