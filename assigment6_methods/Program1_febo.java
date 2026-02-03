package assigment6_methods;

public class Program1_febo {

    static void printFibonacci(int n)
 
	{
		int firstno=1;
		int sceondno=0;
		int temp=0,i=0;
		while(i<n)
		{
			System.out.print(" " +temp);

			temp=firstno+sceondno;
			firstno=sceondno;
			sceondno=temp;
			n--;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibonacci(10);
	}

}
