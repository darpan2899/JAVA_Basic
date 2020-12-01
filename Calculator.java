class Pr1ep
{
 public static void main(String arg[])
 {
  int a,b;
  float c;

  a=Integer.parseInt(arg[0]);
   b=Integer.parseInt(arg[2]);
  
  switch(arg[1])
  {
   case "+":
          c=a+b;
          System.out.println("Addition=" + c);
           break;
   case "-":
          c=a-b;
          System.out.println("Subtraction=" + c);
          break;
   case "*":
          c=a*b;
          System.out.println("Multiplication=" + c);
          break;
   case "/":
          c=((float)a/b);
          System.out.println("Division=" + c);
          break;
   default:
           System.out.println("exit");

  }
 }
}