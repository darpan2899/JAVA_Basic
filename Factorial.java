import java.util.Scanner;
class Pr2ep
{

 int factorial(int n)
 {
  int f=1;
  if(n==1)
  { 
   return 1;
  }
  else
  {
   f=n*factorial(n-1);
  }
 return f;
}
 public static void main(String arg[])
 { 
  Pr2ep p=new Pr2ep();
   int f;
   Scanner scan = new Scanner(System.in);
   int n =scan.nextInt();
   f =p.factorial(n);
  System.out.print(f);
 }
}
 