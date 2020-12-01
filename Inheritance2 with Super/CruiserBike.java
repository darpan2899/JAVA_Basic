class CruiserBike extends TwoWheeler
{
	 String NameOfBike;
 
 CruiserBike(int now,String tob,String nob)
 {
  super(now,tob);
  NameOfBike=nob;
 }
 
 void display()
  {
	    super.display();
		System.out.println("Name Of Bike =" + NameOfBike);
  }
}