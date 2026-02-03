package assignment6_numbers;

public class Program2_Oddput0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;

			int position = 1;
		        int result = 0;
		        int place = 1;

		        while (num > 0) {
		            int digit = num % 10;//0

		            // If position is even, keep digit; if odd, replace with 0
		            if (position % 2 == 0) {
		                result = result + (digit * place);
		            } else {
		                result = result + (0 * place);//0=0+(0*1)
		            }

		            place = place * 10;//10
		            num = num / 10;//123
		            position++;//2
		        }

		        System.out.println("Output: " + result);
		        
		    }
		
	
		

	}


