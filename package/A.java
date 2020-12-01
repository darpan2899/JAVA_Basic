package p1;
public class A
{
	int def;
	public int pub;
	protected int pro;
	private int prv;
	
	public A()
	{
		def=1;
		pub=2;
		pro=3;
		prv=4;
	}
	
	public static void main(String args[])
	{
		A a=new A();
		System.out.println(a.def);
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.prv);
	}
}