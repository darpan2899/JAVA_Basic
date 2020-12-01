class TwoWheeler extends Vehicle
{
 String TypeOfBike;
 
 TwoWheeler(int now,String tob)
 {
  super(now);
  TypeOfBike=tob;
 }
 
 void display()
  {
	    super.display();
		System.out.println("Type Of Bike =" + TypeOfBike);
  }
}