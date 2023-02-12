// Java program to find a pair with the given difference
import java.io.*;

class Two_difference
{
	static boolean findPair(int arr[],int n){
        int l=arr.length;
        int i=0,j=1;
        while(i<arr.length&&j<arr.length){
            if((i!=j)&&((arr[i]-arr[j]==n)|| (arr[j]-arr[i]==n))){
                System.out.println(arr[i]+" "+arr[j]);
                return true;
            }
            else if(arr[j]-arr[i]<n){
                j++;
            }
            else 
            i++;
        }
        System.out.println("Not present");
        return false;
    }

	// Driver program to test above function
	public static void main (String[] args)
	{
		int arr[] = {90, 70, 20, 80, 50};
		int n = 45;
		findPair(arr,n);
	}
}
/*This code is contributed by Devesh Agrawal*/
