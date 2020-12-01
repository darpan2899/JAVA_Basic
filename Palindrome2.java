import java.util.Scanner;
class Pr7_1
{
 public static void main(String arg[])
 { 
  int temp,r,sum=0;
  
   Scanner scan = new Scanner(System.in);
   int n=scan.nextInt();
   temp=n;
   while(n>0)
   {
    r=n%10;
    sum=(sum*10)+r;
    n=n/10;
   }
   
  
   if(temp==sum)
   {
    System.out.print("number is pallindrome");
   }
   else
   {
   System.out.print("number is not pallindrome");
   }
  }
 }