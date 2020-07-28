import java.util.*;
class countSub
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N= sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			int c=0;
			for(int i=0;i<N;i++)
			{
				if(s.charAt(i)=='1')
				{
					c++;
					 
				}
			}
			System.out.println((c*(c+1))/2);
			T--;
		}
	}
}