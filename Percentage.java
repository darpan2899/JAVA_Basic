class Pr2
{
 public static void main(String arg[])
 {
  int r,sum=0;
  float per;
for(int i=0;i<6;i++)
{
  r=Integer.parseInt(arg[i]);
  sum=sum+r;
}
per=((float)sum/6);
  
  System.out.println("percentage=" + per);
 }
}