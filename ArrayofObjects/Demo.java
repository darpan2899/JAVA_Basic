class Demo
{
 int x;
 Demo(int x)
 {
  this.x=x;
  }
  void display()
  {
   System.out.println("x=" + x);
   }
  public static void main(String args[])
  {
   Demo d[] = new Demo[6];
  
   for(int i=0;i<d.length;i++)
   {
     d[i]=new Demo(i+1);
     d[i].display();
    }
  }
}