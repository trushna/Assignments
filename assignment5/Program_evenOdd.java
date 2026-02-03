package assignment5;

public class Program_evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1230005;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int lastDigit=num%10;
			if(lastDigit%2==0)
				evencount++;
			else
				oddcount++;
			num=num/10;
			
		}
		System.out.println("even:"+evencount);
		System.out.println("odd:"+oddcount);

	}

}
