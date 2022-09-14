import java.util.*;
import java.util.Arrays;
public class L3P9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int total=0,n=3,i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			total=a[i]+total;
		}
		System.out.print("the sum of the digits in the number :");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	
		System.out.println("\n Sum:"+total);
	}
}