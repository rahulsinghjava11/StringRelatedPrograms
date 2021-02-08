package com.test.string1;

import java.util.Arrays;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arrayWithoutDuplicates[] =	removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
	
	System.out.println("Array Without Duplicates : ");
    
    for (int i = 0; i < arrayWithoutDuplicates.length; i++)
    {
        System.out.print(arrayWithoutDuplicates[i]+"\t");
    }
     
    System.out.println();
	}

	private static int[] removeDuplicates(int[] inputArray) {
		// TODO Auto-generated method stub
		int noOfElements = inputArray.length;
		
		for (int i = 0; i < noOfElements; i++) 
        {
            for (int j = i+1; j < noOfElements; j++)
            {
                //If any two elements are found equal
                 System.out.println(inputArray[i]+"\t"+inputArray[j]);
                if(inputArray[i] == inputArray[j])
                {
                    //Replace duplicate element with last unique element
                     
                	inputArray[j] = inputArray[noOfElements-1];
                     
                    //Decrementing noOfElements
                     
                	noOfElements--;
                     
                    //Decrementing j
                     
                    j--;
                }
            }
        }
		
		int[] arrayWithoutDuplicates = Arrays.copyOf(inputArray, noOfElements);
		System.out.println(Arrays.toString(arrayWithoutDuplicates));
		return arrayWithoutDuplicates;
	}

}
