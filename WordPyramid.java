import java.util.Scanner;
class Pr9
{
 public static void main(String arg[])
 { 
   Scanner scan = new Scanner(System.in);
  String s=scan.nextLine();
   int n = s.length();

    for(int j=0;j<s.length();j++)
   {
     for(int i=n-1;i>=0;i--)
    {
      System.out.print(" ");
     }
  
     for(int i=0;i<=j;i++)
    {
    System.out.print(s.charAt(i) + " ");
    }
    n=n-1;
    System.out.println();
   }
 }
}