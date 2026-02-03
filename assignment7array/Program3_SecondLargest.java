package assignment7array;

public class Program3_SecondLargest {

				static int secondlargest(int arr[])
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
				for (int i=arr.length-1;i>=0;i--)
				{
					
					System.out.print(arr[i]+" ");
					System.out.println(i);
				}
				System.out.println();
				
				return arr.length-2;
						
				
			}


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int arr[]={1,4,99,88,77,4,88,3,7,9};
				int result=secondlargest(arr);
				
				System.out.println(result);
		      
				
				 System.out.println("Second largest: " + arr[result]);
			

			}

		

	}

