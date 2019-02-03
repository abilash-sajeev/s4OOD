import java.util.Scanner;
public class AbilashSajeev_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m=0,n=1;
		while(m<=n)
		{
			if(m!=0)
				System.out.println("Size of outer diamond should be greater");
			System.out.print("Enter size of outer diamond (odd number) : ");
			m = input.nextInt();
			System.out.print("Enter size of inner diamond (odd number) : ");
			n = input.nextInt();
		}
		m=(m+1)/2-1;
		n=m-((n+1)/2)+1;
		for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<m-i;j++)
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++)
			{
				if ((i>n-1 ) && (j>n-1 &&j<(2*i+1)-n) )
					System.out.print(" ");
				else
					System.out.print("1");
			}
			System.out.println();
		}
		for(int i=m;i>0;i--)
		{
			for(int j=0;j<m+1-i;j++)
				System.out.print(" ");
			for(int j=0;j<2*i-1;j++)
			{
				if ((i>n-1) && (j>n-1 &&j<(2*i-1)-n) )
					System.out.print(" ");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}	
}

