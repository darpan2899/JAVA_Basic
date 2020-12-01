class Test
{
	 void checkArg(int argNo) throws ArgumentGreaterThanOne
	 {
		 if(argNo > 1)
		 {
			 throw new ArgumentGreaterThanOne("argument greater than one");
		 }
		 else
		 {
			 System.out.println("argument not greater than one");
		 }
		 
	 }
	 public static void main(String args[])
	 {
		 Test t = new Test();
		 try
		 {
			 t.checkArg(args.length);
		 }
		 catch(ArgumentGreaterThanOne a)
		 {
			 //System.out.println(a);
			 a.printStackTrace();
	     }
	 }
}