
/**
 * Display a 3*3 matrix with H or T as an element to represent a binary number
 * 
 * @author Yun-feng Zhao
 * 
 * @version 10/28/2019
 * 
 * */

import java.util.Scanner;
public class YunfengZhaoProj08
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		char [][] arr;
		
        // Ask for user input 
		System.out.println("Enter a integer between 0 and 511: ");
		n = input.nextInt();

        // call convert function 
		arr = convert(n);
		if(arr != null)
		    printArray(arr);
		else
		    System.out.println("The input is out of range");
		
	}
	
	
	
	// convert a given integer between 0 and 511 to a 3*3 array with binary representation.
	public static char[][] convert(int n){
	    if ( n < 0 || n > 511) return null;
	    
	// add 0 if less than 9 digits
	    String s = Integer.toBinaryString(n);
	    while(s.length() < 9){
	        s = "0" + s;
	    }
	    
	 // create 3*3 and iterate through
	    char[][] result = new char[3][3];
	    for(int i = 0; i < 9; i++){
	        if(s.charAt(i) == '0')
	            result[i/3][i%3] = 'H';
	        else result[i/3][i%3] = 'T';
	    }
	    return result;
	}
	
	// print out 2D array as a table
	public static void printArray(char[][] arr){
	    
	    for (int i = 0; i < arr.length;i++){
	        for(int j = 0; j < arr[i].length;j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	
}

/* SAMPLE RUN: 
Enter a integer between 0 and 511:                                                                     
389                                                                                                    
T T H                                                                                                  
H H H                                                                                                  
T H T

Enter a integer between 0 and 511:                                                                   
1                                                                                                    
H H H                                                                                                
H H H                                                                                                
H H T