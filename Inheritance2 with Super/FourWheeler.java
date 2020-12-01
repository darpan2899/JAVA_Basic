class FourWheeler extends Vehicle
{
 String TypeOfCar;
 
 FourWheeler(int now,String toc)
 {
  super(now);
  TypeOfCar=toc;
 }
 
 void display()
  {
	    super.display();
		System.out.println("Type Of Car =" + TypeOfCar);
  }
}