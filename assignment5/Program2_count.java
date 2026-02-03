package assignment5;

public class Program2_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=12345;
		while(num>0)
		{
			count++;
			num=num/10;
		}
 System.out.println(count);
	}

}
