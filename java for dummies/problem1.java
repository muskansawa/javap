import java.util.*;
class problem1
{
	public static  void main(String[] args)
	{
		problem1 ob = new problem1();
		ob.UserNum();
	}
	public void UserNum()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				 n = sc.nextInt();
				break;
			}
			catch(Exception e)
			{
				sc.next();
				System.out.println("enter a valid integer");
			}
		}

		if(n!=42)
		{
			System.out.println(n);
			this.UserNum();
		}

	}
}