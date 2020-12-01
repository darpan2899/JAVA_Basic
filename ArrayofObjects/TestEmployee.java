import java.util.Scanner;
class TestEmployee
{
 public static void main(String args[])
 {
  String n,n1;
  int a,s;
  Employee emp[] = new Employee[6];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<emp.length;i++)
  {
   System.out.println("\nenter name");
    n=scan.nextLine();
  System.out.println("enter age");
   a=scan.nextInt();
  System.out.println("enter salary");
   s=scan.nextInt();
   n1=scan.nextLine();
   emp[i]=new Employee(n,a,s,i+1);
   emp[i].display();
  }
 }
} 