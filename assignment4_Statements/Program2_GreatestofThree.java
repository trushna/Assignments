package assignment4_Statements;

public class Program2_GreatestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10;
        int num2=30;
        int num3=5;
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }

        
	}

}
