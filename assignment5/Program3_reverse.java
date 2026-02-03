package assignment5;

public class Program3_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 12345;
	        int reverse = 0;

	        while (number != 0) {//add the counter if want to print for 4 digit ()
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number = number / 10;
	        }

	        System.out.println("Reversed number: " + reverse);
	    }
	}


