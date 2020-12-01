import java.util.Scanner;
class Pr10
{
 public static void main(String arg[])
 { 
   Scanner scan = new Scanner(System.in);
   int n =scan.nextInt();
   int n1=n;

    for(int j=0;j<n1;j++)
   {
     for(int i=n-1;i>0;i--)
    {
      System.out.print(" ");
     }
  
     for(int i=0;i<=j;i++)
    {
    System.out.print("*" + " ");
    }
    n=n-1;
    System.out.println();
   }
   n=n1;
    for(int j=0;j<n1;j++)
   {
    for(int i=0;i<=j;i++)
    {
      System.out.print(" ");
     }
  
      for(int i=n-1;i>0;i--)
    {
    System.out.print("*" + " ");
    }
    n=n-1;
    System.out.println();
   }
 }
}