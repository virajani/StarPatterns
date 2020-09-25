class six
{
	public static void main (String args[])
	{int total=0,temp=0;
		for(int i=1; i<=5;i++)
		{
			
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);
				if(i>j)
				{
					System.out.print("+");
					//temp=j;
					
					
				}
				
				//total=0;
			}
			total=total+i;
			System.out.print("=");
			System.out.print(total);
			System.out.print("\n");
		}
	}
}