class Sedan extends FourWheeler
{
	 String NameOfCar;
 
 Sedan(int now,String toc,String noc)
 {
  super(now,toc);
  NameOfCar=noc;
 }
 
 void display()
  {
	    super.display();
		System.out.println("Name Of Car =" + NameOfCar);
  }
}