import java.util.*;
class N
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of rows and coloumns");
		int n = scan.nextInt();
		for(int i =0 ;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( j==0 || j==n-1 || i==j  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
