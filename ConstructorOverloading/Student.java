import java.util.Scanner;
class Student
{
  String name;
  int rollno,totalmarks;
  Student()
  {
	  name=" ";
	  rollno=0;
	  totalmarks=0;
  }
  Student(String name,int rollno,int totalmarks)
  {
	  this.name=name;
	  this.rollno=rollno;
	  this.totalmarks=totalmarks;
  }
  void display()
  {
	  System.out.print("\n name=" + name + "\n roll no=" + rollno + "\n total marks=" + totalmarks );
  }
}
