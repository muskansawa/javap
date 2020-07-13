class EnumEx
{
	//public static int ll = 9;
	public enum age{gg(8),hh,jj,kk,ll(9)}
	public static void main(String[] args)
	{

		age x ;
		x = age.ll;
		System.out.println("the age is :"+x); 

	}
}