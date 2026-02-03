package assigment6_methods;

public class Program2_Isprime {
	static int Isprime(int num)
	{
		
		if(num<=0)
		{
			return 0;
		}
		for(int i=2;i<num;i++)
		{
			if (num%2==0)
				return 0;
		}
		
		return 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
 	int result1=Isprime(13);
	int result2=Isprime(12);
	if (result1 == 1) {
        System.out.println("Prime Number");
    } else {
        System.out.println("Not a Prime Number");
    }
	if (result2 == 1) {
        System.out.println("Prime Number");
    } else {
        System.out.println("Not a Prime Number");
    }
    
    
	}

}
