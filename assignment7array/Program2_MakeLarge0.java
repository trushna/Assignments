package assignment7array;

public class Program2_MakeLarge0 {
	static void MakeLarge0(int arr[])
	{
	    int temp=0;
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] > arr[j]) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
		}
		arr[4]=0;
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={100,69,300,600,500};
		MakeLarge0(arr);
	

	}

}
