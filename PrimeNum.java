import java.util.*;
class prime 
{
	int num1,num2;
	void setvalue(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void show()
	{
	System.out.println("prime number are :-");
		
		for(int i=num1;i<=num2;i++)
		{
			boolean flag=true;
			for(int j=num1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
			}
		}
	}
}
public class PrimeNum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the starting number ");
		int num1=xyz.nextInt();
		
		System.out.println("enter the ending  number ");
		int num2=xyz.nextInt();
		prime P=new prime();
		P.setvalue(num1,num2);
		P.show();
		
		
	}
}