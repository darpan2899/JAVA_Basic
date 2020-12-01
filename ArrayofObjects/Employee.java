class Employee
{
 String name;
 int age,salary,empno;
  Employee(String n,int a,int s,int e)
  {
   name=n;
   age=a;
   salary=s;
   empno=e;
  }
  void display()
  {
  System.out.print("\nname=" + name + "\nage=" + age + "\nsalary=" + salary + "\nempno=" + empno); 
  }
 }