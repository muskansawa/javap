import java.util.*;

class Lchess
{
	public boolean check(int y, int ar[],int i, int K)
	{
		if(y==K)
		{
			return true;
		}
		 for(int j=0;j<i;j++)
		 {
		 	if(ar[j] == y)
		 	{
		 		return true;
		 	}
		 }
		 return false;

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Lchess ob = new Lchess();
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();

			int p[] = new int[N];

			for(int i =0;i<N;i++)
			{

				int y = sc.nextInt();
				 while(ob.check(y,p,i,K))
				 {
				 	y = sc.nextInt();
				 }
				p[i] = y;

			}

			int x = -1 ; //pos of the pwn who will kill chef
			int mov = K;// that is the max possible moves if a pawn starts from x = 1

			for(int i=0;i<N;i++)
			{
				int n = p[i];
				if(n<K && K%n==0)
				{


					if(K/n<mov)
					{
						x = n;
						mov = K/x;
					}
				}
			}

			System.out.println(x);





			T--;
		}
	}
}