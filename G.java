import java.util.*;
class G
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of rows & coloumn");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( j==0 && i!=0 && i!=n-1 || i==0 && j!=0 || i==n-1 && j!=0 && j<=n/2 ||j==n/2 && i>=3*n/4 || i== 3*n/4 && j>=n/2 || j==n-1 && i>=3*n/4 )
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



