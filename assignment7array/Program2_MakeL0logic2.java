package assignment7array;

public class Program2_MakeL0logic2 {
	static void MakeLa(int arr[])
	{
		int large=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
				index=i;
				
			}
		}
		arr[index]=0;
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={100,69,300,600,500};
		MakeLa(arr);
	
	}

}
