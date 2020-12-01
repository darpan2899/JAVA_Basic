class Vehicle
{
	int NoOfWheels;
	
	Vehicle(int now)
	{
		NoOfWheels=now;
	}
	
	void display()
	{
		System.out.println("No. of wheels =" + NoOfWheels);
	}
}