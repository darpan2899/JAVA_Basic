class Circle extends Shape implements Shape2D
{
 double a;
 
 public void area(float r)
 {
  a=3.14*r*r;
 }

 void display()
 {
   System.out.println("area=" + a );
 }
} 