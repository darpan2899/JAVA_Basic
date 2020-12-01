class Pr3
{
 public static void main(String arg[])
 {
  int a,b;
  float c;

  a=Integer.parseInt(arg[0]);
   b=Integer.parseInt(arg[1]);
 
  c=a+b;
   System.out.println("Addition=" + c);
  c=a-b;
 System.out.println("Subtraction=" + c);
 c=a*b;
 System.out.println("Multiplication=" + c);
c=((float)a/b);
 System.out.println("Division=" + c);
 
 }
}