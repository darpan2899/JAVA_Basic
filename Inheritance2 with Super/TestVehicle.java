import java.util.Scanner;
class TestVehicle
{
 public static void main(String args[])
 {
	 SportsBike sb = new SportsBike(2,"sports","Hayabusa");
	 CruiserBike cb = new CruiserBike(2,"cruise","Harley");
	 Suv sv = new Suv(4,"suv","Fortuner");
	 Sedan sd = new Sedan(4,"sedan","dzire");
	  sb.display();
	  cb.display();
	  sv.display();
	  sd.display();
	  
 }
}