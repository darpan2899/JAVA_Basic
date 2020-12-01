
 import java.util.Scanner;
class Pr8
{
 public static void main(String arg[])
 { 
  int a,e,i,o,u,c;
  a=e=o=u=i=c=0;
  Scanner scan = new Scanner(System.in);
  String s;
  int n;
  char ch;
  do
  {
   System.out.println("Enter String");
   s=scan.nextLine();
   s=s.toLowerCase();
   if(s.equalsIgnoreCase("quits"))
   {
    break;
   }
    n = s.length();
     for(int j=0;j<n;j++)
     {
       ch=s.charAt(j);
       if(ch=='a')
       {
        a++;
       }
      else if(ch=='e')
      {
       e++;
       }
       else if(ch=='i')
      {
       i++;
       }
       else if(ch=='o')
      {
       o++;
       }
       else if(ch=='u')
      {
       u++;
       }
      else
      {
       c++;
      }
    }
  }while(scan.hasNext());
  System.out.println("a=" + a);
  System.out.println("e=" +e);
  System.out.println("i=" +i);
  System.out.println("o=" +o);
  System.out.println("u=" +u);
  System.out.println("c=" +c);
 }
 }