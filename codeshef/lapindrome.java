import java.util.*;

class lapindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String s = sc.nextLine();
			int l = s.length();
			 
			boolean lapin= true;
			for(int i =0;i<=mid;i++)
			{
				if(s.charAt(i)!= s.charAt(l-i))
				{
					lapin = false;
					break;
				}

			}
			System.out.println(lapin?"YES":"NO");
			T--;

		}
	}
}