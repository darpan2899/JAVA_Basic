class Pr4
{
 public static void main(String arg[])
 { 
  String s="hello How are You?";
   int len = s.length();
   char a[]=new char[len];
   a=s.toCharArray();
   for(int i=(len/2);i<len;i++)
   {
	  
    System.out.print(a[i]);
    }
  }
 }

