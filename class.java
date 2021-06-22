package analyze;

import java.util.Scanner;

public class Product_Cum {
	
	private int n;
	private int current=1;
	private int product=1;
	Scanner in=new Scanner(System.in);
	public int getValue()
	{
		return n;
	}

	public int Current()
	{
		return current;
	}
	
	public void readValue()
	{
		System.out.printf("\nHow Many Are you Going to Calculate? :");
	
		n=in.nextInt();	
	}
	
	public void cumulative()
	{
		int i;
		System.out.printf("\nEnter Value One by One (For example :9 9 8 7 6 )::");
		for(i=1;i<=n;i++)
		{
			current=in.nextInt();
			
			product=product*current;			
		}
	}
  
	public void display()
	{
		System.out.printf("\nProduct:%d",product);

	}
	
	
}
