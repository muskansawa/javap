import java.util.*;

class problem2
{
	static int ca=0,cb=0,cc=0,cd=0,ce=0,cf=0,cg=0,ch=0,ci=0,cj=0,ck=0,cl=0,cm=0,cn=0,co=0,cp=0,cq=0,cr=0,cs=0,ct=0,cu=0,cv=0,cw=0,cx=0,cy=0,cz=0;
	public static void main(String[] args)
	{
		int j;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for( j=0;j<t;j++)
		{
			ca=0;cb=0;cc=0;cd=0;ce=0;cf=0;cg=0;ch=0;ci=0;cj=0;ck=0;cl=0;cm=0;cn=0;co=0;cp=0;cq=0;cr=0;cs=0;ct=0;cu=0;cv=0;cw=0;cx=0;cy=0;cz=0;

			String  s = sc.next();
			int l = s.length();
			int l1,l2;
			if(l%2==0)
			{
				l1= (l/2)-1;
				l2 = l/2;
			}
			else
			{
				l1= (l/2)-1;
				l2= (l/2)+1;
			}
			for(int i=0;i<=l1;i++)
			{
				char c = s.charAt(i);
				countadd(c);
			}
			for(int i=l2;i<l;i++)
			{
				char c = s.charAt(i);
				countsub(c);
			}

			if(ca==0&&cb==0&&cc==0&&cd==0&&ce==0&&cf==0&&cg==0&&ch==0&&ci==0&&cj==0&&ck==0&&cl==0&&cm==0&&cn==0&&co==0&&cp==0&&cq==0&&cr==0&&cs==0&&ct==0&&cu==0&&cv==0&&cw==0&&cx==0&&cy==0&&cz==0)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}


	}
	public static void countadd(char ch)
	{
		switch(ch)
		{
			case 'a':
			ca++;
			break;

			case 'b':
			cb++;
			break;

			case 'c':
			cc++;
			break;
			
			case 'd':
			cd++;
			break;

			case 'e':
			ce++;
			break;

			case 'f':
			cf++;
			break;

			case 'g':
			cg++;
			break;

			case 'h':
			ch++;
			break;

			case 'i':
			ci++;
			break;

			case 'j':
			cj++;
			break;

			case 'k':
			ck++;
			break;

			case 'l':
			cl++;
			break;

			case 'm':
			cm++;
			break;

			case 'n':
			cn++;
			break;

			case 'o':
			co++;
			break;

			case 'p':
			cp++;
			break;

			case 'q':
			cq++;
			break;

			case 'r':
			cr++;
			break;

			case 's':
			cs++;
			break;

			case 't':
			ct++;
			break;

			case 'u':
			cu++;
			break;

			case 'v':
			cv++;
			break;

			case 'w':
			cw++;
			break;

			case 'x':
			cx++;
			break;

			case 'y':
			cy++;
			break;

			case 'z':
			cz++;
			break;


		}
	}
	public static void countsub(char ch)
	{
		switch(ch)
		{
			case 'a':
			ca--;
			break;

			case 'b':
			cb--;
			break;

			case 'c':
			cc--;
			break;
			
			case 'd':
			cd--;
			break;

			case 'e':
			ce--;
			break;

			case 'f':
			cf--;
			break;

			case 'g':
			cg--;
			break;

			case 'h':
			ch--;
			break;

			case 'i':
			ci--;
			break;

			case 'j':
			cj--;
			break;

			case 'k':
			ck--;
			break;

			case 'l':
			cl--;
			break;

			case 'm':
			cm--;
			break;

			case 'n':
			cn--;
			break;

			case 'o':
			co--;
			break;

			case 'p':
			cp--;
			break;

			case 'q':
			cq--;
			break;

			case 'r':
			cr--;
			break;

			case 's':
			cs--;
			break;

			case 't':
			ct--;
			break;

			case 'u':
			cu--;
			break;

			case 'v':
			cv--;
			break;

			case 'w':
			cw--;
			break;

			case 'x':
			cx--;
			break;

			case 'y':
			cy--;
			break;

			case 'z':
			cz--;
			break;


		}
	}
}