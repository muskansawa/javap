import java.util.*;

class MutantMinions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=0;i<T;i++)
		{

			int N = sc.nextInt();
			int K = sc.nextInt();

			int IC[] = new int[N];
			int wm =0;

			for(int j=0;j<N;j++)
			{
				IC[j] = sc.nextInt();
				IC[j] = IC[j] +K;

				if(IC[j]%7==0)
					wm++;


			}	
			System.out.println(wm);
		}
	}
}