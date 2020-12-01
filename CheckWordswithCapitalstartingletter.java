class Pr6
{
 public static void main(String arg[])
 { 
  int c=0,v=0;
  String s="hello How are You?";
   int len = s.length();
   char a[]=new char[len];
   a=s.toCharArray();
   for(int i=0;i<len;i++)
   {
    if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
    {
     v++;
    }
    else if(a[i]==' ')
    {
    }
    else
    {
      c++;
    }
    
   }
   for(int i=0;i<len;i++)
   {
    System.out.print(a[i]);
    }
    System.out.print("vowels=" + v);
     System.out.print("consonent=" + c);
  }
 }