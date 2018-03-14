package selection.sort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();		
				
		int  r, n = 0;

		System.out.println("Enter the number of array elements:");

		n = sc.nextInt();

				int[] array = new int[n];
				
				System.out.println("Enter the number to which the range of random numbers will be added (by default from 0 to the number you lead)");
				r = sc.nextInt();
				
				System.out.println("Here is your array of" +n+ " array elements");
				
				for(int i = 0; i<n; i++){
					array[i] = rand.nextInt(r);
		 	
				System.out.println(array[i]);
			}
				System.out.println("Sorted");
				
				int[] sort = selectionsort(array);
				
				 for(int i = 0; i<sort.length; i++){
					 System.out.println(sort[i]);
				 }
				}

	 public static int[] selectionsort(int[] arr){
		    for (int i = 0; i < arr.length-1; i++)
		    {
		        int index = i;
		        for (int j = i+1; j < arr.length; j++)//шукає елемент 
		            if (arr[j] < arr[index]) 
		                index = j;  

		        int smallerNumber = arr[index]; 
		        arr[index] = arr[i];
		        arr[i] = smallerNumber;

		    }
		    return arr;
}	

	
}