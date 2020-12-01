import java.util.Scanner;
class Person
{
  String name;
  int age,salary;
  void setdata()
  {
	  name=" ";
	  age=0;
	  salary=0;
  }
  void getdata()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("\nEnter your Name");
	  name = scan.nextLine();
	  System.out.println("Enter your Age");
	  age =scan.nextInt();
	  System.out.println("Enter your Salary");
	  salary =scan.nextInt();
  }
  void display()
  {
	  System.out.print(" name=" + name + "\n age=" + age + "\n salary=" + salary );
  }
}
