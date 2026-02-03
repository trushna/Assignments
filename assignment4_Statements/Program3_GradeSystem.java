package assignment4_Statements;

public class Program3_GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=10;
		
		if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Grade: Fail");
        }
	}

}
