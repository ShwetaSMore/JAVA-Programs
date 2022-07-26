import java.lang.*;

class ArrayDemo
{
	public static void main(String args[])
	{
		int arr[] = new int [5]; //1st way
		arr[0] = 11;
		arr[1] = 21;
		arr[2] = 51;
		arr[3] = 101;
		arr[4] = 111;

		System.out.println("Length of array is : "+arr.length); // .length is property
		int brr[] = {11,21,51,101,111};	//2nd way
		int crr[] = new int[] {11,21,51,101,111}; //3rd way, Syntactical combination if arr & brr


		for(int iCnt=0; iCnt<arr.length; iCnt++)
		{
			System.out.println(arr[iCnt]);
		}


		int i = 0;
		while(i < arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}


		int j = 0;
		do
		{
			System.out.println(arr[j]);
			j++;
		}while(j < arr.length);


		for(int no : arr)
		{
			System.out.println(no);
		}
	}
}