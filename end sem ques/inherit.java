class inherit
{
	/*public inherit()
	{
		System.out.println("constructor of base class ");
	}*/
	public inherit(int i)
	{
		System.out.println(i);
		 
	}
	 public void play()
	 {
	 	System.out.println("playing!");
	 } 

}


class child extends inherit
{
	public child()
	{
		System.out.println("constructor of child class called");
	}
	public child(int i)
	{
		System.out.println("papa");
	}

	public void play()
	 {
	 	System.out.println("child is playing!");
	 } 

	public static void main(String[] args)
	{
		child ob = new child();
		ob.play();
		inherit obj = ob;
		obj.play();
		System.out.println(ob instanceof child);
   		System.out.println(ob instanceof inherit);

	}
	public void kick( child b)
	{
		System.out.println("kicked!");
	}
}

final class Test
{
	public static void main(String[] args)
	{
   		inherit og = new child();
   		og.play();
   		((child)og).kick((child)og);
   		System.out.println(og instanceof child);
   		System.out.println(og instanceof inherit);
	}

}