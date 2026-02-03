package assignment5;

public class Program_paln {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int number = 121;
			 int temp=number;
		        int reverse = 0;

		        while (number != 0) {//add the counter if want to print for 4 digit ()
		            int digit = number % 10;
		            reverse = reverse * 10 + digit;
		            number = number / 10;
		        }

		        System.out.println("Reversed number: " + reverse);
		   
		if(temp==reverse)
			System.out.println("it is palendrome");
		else
			System.out.println("it is not palendrome");
		
		
		
		}
		
		

	}


