package assignment5_loops;

public class Program2_count_of_no {
	public static void main(String[] args) {

	 
		int count=0;
		int num=12347;
		while(num>0)
		{
			count++;
			num=num/10;
		}
System.out.println(count);
}	
}

