package assigment6_methods;

public class Program3_GCD {
	static int findGCD(int a,int b)
	{
		int GCD=1;
		for(int i=1;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				GCD =i;
			}
		}
		return GCD;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=findGCD(13,9);
		System.out.println("GCD is :" + result);
	}

}
