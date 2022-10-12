package Array;

import java.util.Scanner;

public class MultDimArray {//This helps to print a matrix

	public static void main(String[] args) {
	    int[][] nums = new int[3][3];
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the values for rows and columns");
	    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	nums[i] [j] = scn.nextInt();
            }
	    }
	    
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		System.out.print(nums[i][j]+" ");
	    	}
	    	System.out.println(" ");
}
}
}
