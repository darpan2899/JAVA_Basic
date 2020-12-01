import java.util.Scanner;
class TestEmployee
{
 public static void main(String args[])
 {
  String n,n1,ns,tow;
  int a,s;
  Teaching t[] = new Teaching[2];
  NonTeaching nt[] = new NonTeaching[2];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<t.length;i++)
  {
   System.out.println("\nenter name");
    n=scan.nextLine();
  System.out.println("enter age");
   a=scan.nextInt();
  System.out.println("enter salary");
   s=scan.nextInt();
   n1=scan.nextLine();
   System.out.println("\nenter name of subject");
   ns=scan.nextLine();
   t[i]=new Teaching(n,a,s,i+1,ns);
   t[i].display();
  }
  for(int i=0;i<nt.length;i++)
  {
   System.out.println("\nenter name");
    n=scan.nextLine();
  System.out.println("enter age");
   a=scan.nextInt();
  System.out.println("enter salary");
   s=scan.nextInt();
   n1=scan.nextLine();
   System.out.println("\nenter type of work");
   tow=scan.nextLine();
   nt[i]=new NonTeaching(n,a,s,i+1,tow);
   nt[i].display();
  }
 }
} 