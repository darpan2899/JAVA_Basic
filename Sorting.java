import java.util.*;
class Pr3ep
{
  public static void main(String arg[])
  { 
   int n;
   n=Integer.parseInt(arg[0]);
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=Integer.parseInt(arg[i+1]);
   }
  /* for(int i=0;i<n;i++)
   {
     for(int j=i+1;j<n;j++)
     {
       if(a[i]>a[j])
       {
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
      }
   }*/
   Arrays.sort(a);
   for(int i=0;i<n;i++)
   {
    System.out.println(a[i]);
   }
  
  }
}
 