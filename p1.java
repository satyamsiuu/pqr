import java.util.*;

public class p1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns:-");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int even[] = new int[n*m];
		int odd[] = new int[n*m];
		int e=0,o=0;
		
		System.out.println("Enter elements in the array:-");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if((a[i][j] = sc.nextInt())%2==0)
					even[e++] = a[i][j];
				else
					odd[o++] = a[i][j];
			}
		}
		
		System.out.println("The even elements are:-");
		for(int i=0;i<e;i++)
			System.out.print(even[i]+" ");
		
		System.out.println("\nThe odd elements are:-");
		for(int i=0;i<o;i++)
			System.out.print(odd[i]+" ");
		System.out.println();
	}
}
			
