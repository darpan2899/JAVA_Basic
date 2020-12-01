class Pr5
{
 public static void main(String arg[])
 { 
  int count=0;
  String s="hello How are You?";
   int len = s.length();
   char a[]=new char[len];
   a=s.toCharArray();
   for(int i=0;i<len;i++)
   {
    if(a[i]==' '&&Character.isUpperCase(a[i+1]))
    count++;
    }
    System.out.print(count);
  }
 }