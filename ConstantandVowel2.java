class Pr5_1
{
 public static void main(String arg[])
 { 
  int count=0;
  String s="Hello How are You?";
   int len = s.length();
   String a[]=s.split(" ");
   
   for(int i=0;i<a.length;i++)
   {
    if(Character.isUpperCase(a[i].charAt(0)))
    count++;
    }
    System.out.print("The no. of words having first letter capital are\n" + count);
  }
 }