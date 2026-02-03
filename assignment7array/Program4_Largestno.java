package assignment7array;

public class Program4_Largestno {
	static int Largest(int arr[])
	{
		int large=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
				
			}
		}
		return large;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={100,200,300,400,500};
		int result= Largest(arr);
		System.out.println("largest no : " +result);
	}

}
