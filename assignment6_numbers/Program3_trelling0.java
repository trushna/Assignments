package assignment6_numbers;

public class Program3_trelling0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		int result=0;
		int onum=num;
		int count=0;
		while(num>0)
{
		     count++;
				num=num/10;

			
}
		
		
		if(count==1)
		{
		   result=onum*10;
			System.out.println("result " +result);
		}
		else if(count==2)
		{
		result =onum*100;
		System.out.println("result"  +result);
		
		}
		else
		{
			System.out.println("result" +onum);
		}
		}
	}

	


