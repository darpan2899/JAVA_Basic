class SportsBike extends TwoWheeler
{
	 String NameOfBike;
 
 SportsBike(int now,String tob,String nob)
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