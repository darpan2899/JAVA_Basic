class Circle
{
	double area;
	double radius;
	
	Circle(int rad)
	{ 
	    this.radius=rad;
		area=3.14*radius*radius;
		 System.out.println("Integer call");
	}
	
	Circle(double rad)
	{
		this.radius=rad;
		area=3.14*radius*radius;
		System.out.println("Double call");
	}
	void display()
	{
		System.out.println("area=" + area );
	}
}