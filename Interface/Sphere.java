class Sphere extends Shape implements Shape3D
{
	double v;
	
	public void  volume(float r)
	{
	  v= (4/3)*3.14*r*r*r;
	}
	 void display()
	 {
	   System.out.println("volume=" + v);
	 }
}