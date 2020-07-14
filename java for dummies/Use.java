class Use
{
	public static void main(String[] args)
	{
		Use oge = new Use();
		 oge.apple();
		Use ob = new Use();
		 ob.apple();
		  
	}
	public void apple()
	{
		System.out.println(this);
	}
}