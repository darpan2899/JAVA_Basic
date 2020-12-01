import java.util.Scanner;
class Pr7
{
 public static void main(String arg[])
 { 
  int count=0;
  
  Scanner scan = new Scanner(System.in);
  String s=scan.nextLine();
   int n = s.length();
   
   
   for(int i=0,j=n-1;i<(n/2);i++,j--)
   {
    if(s.charAt(i)==s.charAt(j))
    {
    count=1;
     }
    else
    {
    count=0;
    break;
    }
  }
   if(count==1)
   {
    System.out.print("string is pallindrome");
   }
   else
   {
   System.out.print("string is not pallindrome");
   }
  }
 }