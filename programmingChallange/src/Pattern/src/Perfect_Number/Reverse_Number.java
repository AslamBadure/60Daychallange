package Perfect_Number;

public class Reverse_Number 
{
	public static void main(String[] args)
	{
		int num=1234;
		int rev=0;
		int temp=0;
		
		while(num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev+":reverse number");
	}
}
